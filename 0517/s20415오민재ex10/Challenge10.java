package s20415������ex10;

import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square a = new Square();
		System.out.println("# ù��° ���簢�� ���� : " + a.getArea());
		System.out.print("�� ���� ���� �Է� >> ");
		Square b = new Square(sc.nextInt());
		System.out.println("## �ι�° ���簢�� ���� : " + b.getArea());
		sc.close();
	}

}

class Square{
	int Area;
	
	Square(){
		Area = 1;
	}
	
	Square(int r){
		Area = r * r;
	}
	
	public int getArea() {
		return Area;
	}

	public void setArea(int area) {
		Area = area;
	}
	
}