
public class Exam1 {

	public void method (int a, int b) {
		try {
			System.out.println(a + "/" + b + "=" + (a/b));
		} catch (Exception e) {
			System.out.println("e.getMesage() : " + e.getMessage());
			System.out.println("e.toString() : " + e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("Finally : Ãâ·Â");
		}
		
	}

	
	public static void main(String[] args) {
		new Exam1().method(4, 0);
	}

}
