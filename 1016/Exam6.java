import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		String op;
		int result = 0;
		
		System.out.print("ù��° ���� �Է��ϼ���  : ");
		num1 = sc.nextInt();
		System.out.print("����� �����ڸ� �Է��ϼ��� : ");
		op = sc.next();
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		num2 = sc.nextInt();
		
		try {
			
			switch(op) {
				case "+" : result = num1 + num2; break;
				case "-" : result = num1 - num2; break;
				case "*" : 
					if(num1 == 0 || num2 == 0) throw new Exception("0�� ���ϸ� ������ 0�Դϴ�.");
					result = num1 * num2; break;
				case "/" : 
					if(num2 == 0) throw new Exception("0���� ������ �ȵ˴ϴ�.");
					result = num1 / num2; break;
				default : System.out.println("�߸��� �������Դϴ�.");
				
				System.out.println(num1 + op + num2 + "=" + result);
			}
			
			if (result < 0)
				throw new Exception("����� �����׿� ��");
			
		} catch (Exception e) {
			
			System.out.println("���ܹ߻� => " + e.getMessage());
			
		}
		

		

	}

}
