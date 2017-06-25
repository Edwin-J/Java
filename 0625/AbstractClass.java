
abstract class Shape {
	public abstract double getArea();
	public abstract double getCircum();
}

class Circle extends Shape {
	private double r;
	
	public Circle(double r) {
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
	
	public Rectangle (double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double getArea() {
		return w * h;
	}

	@Override
	public double getCircum() {
		return 2 * w + 2 * h;
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		System.out.println("원의 반지름 : 3.0일 때,");
		Circle c = new Circle(3.0);
		System.out.println("원의 넓이 (println): " + c.getArea());
		System.out.printf("원의 둘레 (printf): %.2f\n", c.getCircum());
		System.out.println();
		System.out.println("사각형의 너비 : 3.0, 높이 : 5.0일 때,");
		Rectangle r = new Rectangle(3.0, 5.0);
		System.out.printf("사각형의 넓이 (printf): %.2f\n", r.getArea());
		System.out.println("사각형의 둘레 (println): " + r.getCircum());
	}

}
