
public class ExceptionExam3 {

	public static void method() {
		
		try {
			int n = Integer.parseInt("number");
			System.out.println(n);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormat ���ܰ� �߻���");
		}
		
	}
	
	public static void main(String[] args) {
		method();
	}

}