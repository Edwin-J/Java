package s20415������ex12;

public class Challenge12 {

	public static void main(String[] args) {
		Shape triangle = new Shape("�ﰢ��", "red", 3);
		triangle.printInfo();
		System.out.println();
		Shape rectangle = new Shape("�簢��", "blue", 4);
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
		System.out.println("���� : " + kind);
		System.out.println("���� : " + color);
		System.out.println("�𼭸� �� : " + edge);
	}
	
}
