import java.util.ArrayList;

class Shape {
	public void draw() { System.out.println("Shape를 그림"); }
}

class Rectangle extends Shape {
	public void draw() { System.out.println("Rectangle을 그림"); }
}

class Circle extends Shape {
	public void draw() { System.out.println("Circle을 그림"); }
}

public class ShapeTest {
	
	public static void main(String[] args){
		ArrayList<Shape> array = new ArrayList<Shape>();
		array.add(new Circle());
		array.add(new Rectangle());
		
		for (Shape i : array)
			i.draw();
		
	}
	
}
