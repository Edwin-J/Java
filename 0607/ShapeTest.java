
class Shape {
	public void draw() { System.out.println("Shape�� �׸�"); }
}

class Rectangle extends Shape {
	public void draw() { System.out.println("Rectangle�� �׸�"); }
}

class Circle extends Shape {
	public void draw() { System.out.println("Circle�� �׸�"); }
}

public class ShapeTest_3 {
	public static Shape[] shapeArray = new Shape[3];
	
	public static void init(){ 
		shapeArray[0] = new Shape();
		shapeArray[1] = new Rectangle();
		shapeArray[2] = new Circle();
	}
	
	public static void drawAll(){
		for (Shape s : shapeArray)
			s.draw();
	}
	
	public static void main(String[] args){
		init();
		drawAll();
	}
	
}
