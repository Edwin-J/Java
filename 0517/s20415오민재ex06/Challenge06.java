package s20415오민재ex06;

import java.util.Scanner;

public class Challenge06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력 : ");
		
		int size = sc.nextInt();
		int s20415[] = new int[size];
		int value = 6;
		
		for(int i = 0; i < size; i++){
			s20415[i] = value * (i+1);
			System.out.println("s20415[" + i + "] = " + s20415[i]);
		}

	}

}
