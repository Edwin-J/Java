
public class ShapeTest {

	public static void main(String[] args) {
		Shape shapes[] = new Shape[3];
		
		shapes[0] = new Shape(0, 0);
		shapes[1] = new Shape(1, 1);
		shapes[2] = new Shape(2, 2);
		
		for (Shape shape : shapes)
			shape.draw();
		
	}

}

class Shape {
	private int x, y;
	
	Shape(int x, int y){
		this.x = x; this.y = y;
	}
	
	public void draw(){
		System.out.println("(" + x + ", " + y + ")에 도형을 그림.");
	}
	
}
