package s20415오민재ex10;

import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square a = new Square();
		System.out.println("# 첫번째 정사각형 면적 : " + a.getArea());
		System.out.print("한 변의 길이 입력 >> ");
		Square b = new Square(sc.nextInt());
		System.out.println("## 두번째 정사각형 면적 : " + b.getArea());
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