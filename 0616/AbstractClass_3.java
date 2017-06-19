import java.util.Scanner;

abstract class Shape {
	public abstract double getArea();
	public abstract double getCircum();
}

class Circle extends Shape {
	private double r;
	
	Circle() {	}
	Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * 3.14;
	}

	@Override
	public double getCircum() {
		return 2 * r * 3.14;
	}
	
}

class Rectangle extends Shape {
	private double w;
	private double h;
	
	Rectangle() {}
	Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}
	
	@Override
	public double getArea() {
		return w * h;
	}

	@Override
	public double getCircum() {
		return (2 * w) + (2 * h);
	}
	
}

public class AbstractClass_3 {
	
	public static void main(String[] args) {
		double r;
		double w;
		double h;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 : ");
		r = sc.nextDouble();
		
		Shape s1 = new Circle(r);
		System.out.printf("원의 넓이 : %.2f\n", s1.getArea());
		System.out.printf("원의 둘레 : %.2f\n", s1.getCircum());
		
		System.out.println();
		
		System.out.print("사각형의 너비 : ");
		w = sc.nextDouble();
		System.out.print("사각형의 높이 : ");
		h = sc.nextDouble();
		
		Shape s2 = new Rectangle(w, h);
		System.out.printf("사각형의 넓이 : %.2f\n", s2.getArea());
		System.out.printf("사각형의 둘레 : %.2f\n", s2.getCircum());
	}

}
