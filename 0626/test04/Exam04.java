package test04;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� �Է� : ");
		double a = sc.nextDouble();
		Cube c = new Cube();
		System.out.println("������ü�� ���� : " + c.getVolume(a));

	}

}
