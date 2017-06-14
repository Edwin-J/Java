import java.util.ArrayList;

class Shape {
	public void draw() { System.out.println("Shape�� �׸�"); }
}

class Rectangle extends Shape {
	public void draw() { System.out.println("Rectangle�� �׸�"); }
}

class Circle extends Shape {
	public void draw() { System.out.println("Circle�� �׸�"); }
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
