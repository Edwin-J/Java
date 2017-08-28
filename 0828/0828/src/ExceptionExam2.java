
public class ExceptionExam2 {

	public static void method() {
		String irum[] = new String[3];
		irum[3] = "홍길동";
	}
	
	public static void main(String[] args) {
		
		try {
			method();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 예외 발생");
		}
		

	}

}
