import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[3];
		
		try {
			
			System.out.print("정수형 a값 입력 : ");
			int a = sc.nextInt();
			
			System.out.print("정수형 b값 입력 : ");
			int b = sc.nextInt();
			
			System.out.print("정수형 c값 입력 : ");
			int c = sc.nextInt();
			
			array[c] = a / b;
			
			sc.close();
			
		} catch (ArithmeticException ae) {
			
			System.out.println("0으로 나눌 수 없음");
			
		} catch (ArrayIndexOutOfBoundsException oe) {
			
			System.out.println("배열의 인덱스를 벗어났음");
			
		} finally {
			
			System.out.println("프로그램 개발자 : 오민재");
			
		}
		

	}

}
