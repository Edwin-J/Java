import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> ");
		String str = sc.nextLine();
		StringBuffer STR = new StringBuffer(str);
		// ���� ���� �Է�
		
		while (true) { // ���� �ݺ�
			
			System.out.print("��� : ");
			String cmd = sc.nextLine();
			
			if (cmd.equals("exit")) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			} // 'exit' �Է� �� ����
			
			try {
				
				String strArray[] = cmd.split("!");
				String str1 = strArray[0];
				String str2 = strArray[1];
				// '!'�� �������� ã������ ���ڿ��� �ٲٷ��� ���ڿ� �з�
					
				int index = STR.indexOf(str1); // ã������ ���ڿ� ��ġ
				STR.replace(index, index + str1.length(), str2); // �ٲٷ��� ���ڿ��� �ٲ���
				System.out.println(STR);
				
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("�߸��� ����Դϴ�!");
				// ���� �߻� �� ���
			}
			
		} 
		
	}

}
