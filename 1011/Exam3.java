import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[3];
		
		try {
			
			System.out.print("������ a�� �Է� : ");
			int a = sc.nextInt();
			
			System.out.print("������ b�� �Է� : ");
			int b = sc.nextInt();
			
			System.out.print("������ c�� �Է� : ");
			int c = sc.nextInt();
			
			array[c] = a / b;
			
			sc.close();
			
		} catch (ArithmeticException ae) {
			
			System.out.println("0���� ���� �� ����");
			
		} catch (ArrayIndexOutOfBoundsException oe) {
			
			System.out.println("�迭�� �ε����� �����");
			
		} finally {
			
			System.out.println("���α׷� ������ : ������");
			
		}
		

	}

}
