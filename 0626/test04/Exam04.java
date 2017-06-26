package test04;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 변의 길이 입력 : ");
		double a = sc.nextDouble();
		Cube c = new Cube();
		System.out.println("정육면체의 부피 : " + c.getVolume(a));

	}

}
