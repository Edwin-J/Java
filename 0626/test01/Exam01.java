package test01;

public class Exam01 {

	public static void main(String[] args) {
		Shape[] array = { new Shape(), new Rectangle(), new Circle() };
		for (Shape s : array) s.draw();
	}

}
