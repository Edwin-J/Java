
public class Exam5 {

	public static void main(String[] args) {

		int a = 100, b = 0;
		int result;
		
		try {
			
			if (b == 0)
				throw new Exception("Divided by zero");
			
			result = a / b;
			
		} catch (Exception e) {
			
			System.out.println("Exception : " + e.getMessage());
		
		}
		
		

	}

}
