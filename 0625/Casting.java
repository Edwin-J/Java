
class Shape {
	int x, y;
}
class Rectangle extends Shape {
	int width, height;
}

public class Casting {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		Rectangle r = (Rectangle) s;
		r.x = 0;
		r.width = 0;
		System.out.println(r.x);
		System.out.println(r.width);

	}

}
