package practice_0821;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf(">> ");
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		
		while (true) {
			
			System.out.printf("��� : ");
			String command = sc.nextLine();
			if (command == "�׸�") {
				System.out.println("�����մϴ�.");
				break;
			}
			String[] str2 = command.split("!");
			if (str2[0] == "")
				System.out.println("�߸��� ����Դϴ�!");
			
			for (int i = 0; i < str1.length; i++) {
				
				if (str2[0].equals(str1[i])) {
					str1[i] = str2[1];
					
					for (int j = 0; j < str1.length; j++) {
						System.out.println(str1[j]);
						break;
					}
					
				}

			}
			
			
			
		}
		
	}
	
}
