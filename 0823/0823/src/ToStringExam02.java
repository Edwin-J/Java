
class Point {
	private int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString(){
		return "x: " + x + ", y: " + y;
	}
}

public class ToStringExam02 {

	public static void main(String[] args) {

		Point p = new Point(10, 20);
		System.out.println(p);

	}

}
