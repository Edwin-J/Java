
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
		System.out.println("���� ������ : 3.0�� ��,");
		Circle c = new Circle(3.0);
		System.out.println("���� ���� (println): " + c.getArea());
		System.out.printf("���� �ѷ� (printf): %.2f\n", c.getCircum());
		System.out.println();
		System.out.println("�簢���� �ʺ� : 3.0, ���� : 5.0�� ��,");
		Rectangle r = new Rectangle(3.0, 5.0);
		System.out.printf("�簢���� ���� (printf): %.2f\n", r.getArea());
		System.out.println("�簢���� �ѷ� (println): " + r.getCircum());
	}

}
