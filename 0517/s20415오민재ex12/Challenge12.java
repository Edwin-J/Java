package s20415오민재ex12;

public class Challenge12 {

	public static void main(String[] args) {
		Shape triangle = new Shape("삼각형", "red", 3);
		triangle.printInfo();
		System.out.println();
		Shape rectangle = new Shape("사각형", "blue", 4);
		rectangle.printInfo();
	}

}

class Shape{
	private String kind;
	private String color;
	private int edge;
	
	Shape(String kind, String color, int edge){
		this.kind = kind;
		this.color = color;
		this.edge = edge;
	}
	
	public void printInfo(){
		System.out.println("종류 : " + kind);
		System.out.println("색깔 : " + color);
		System.out.println("모서리 수 : " + edge);
	}
	
}
