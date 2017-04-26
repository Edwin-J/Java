class Point {
	private int x;
	private int y;
	
	public Point(){};
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.println("점 [x = " + this.x + ", y = " + this.y + "]을 그렸습니다.");
	}
	
	public void show(boolean draw) {
		if (draw == true){
			System.out.println("점 [x = " + this.x + ", y = " + this.y + "]을 그렸습니다.");
		}
		
		else {
			System.out.println("점 [x = " + this.x + ", y = " + this.y + "]을 지웠습니다.");
		}
	}
	
}

class ColorPoint extends Point{
	public ColorPoint(){};
	public ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void show(){
		System.out.println("점 [x = " + getX() + ", y = " + getY() + ", color = " + color + "]을 그렸습니다.");
	}
	
}

public class PointTest {
	public static void main(String[] args) {
		
		Point point01 = new Point(2, 3);
		ColorPoint point02 = new ColorPoint(3, 4, "red");
		
		point01.show();
		point02.show();
	}
}
