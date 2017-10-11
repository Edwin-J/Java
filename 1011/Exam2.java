
public class Exam2 {

	public static void main(String[] args) {
		try {
			
			String data1 = args[0];
			String data2 = args[1];
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			System.out.println(num1 + num2);
			
		} catch (NumberFormatException e) {
			
			System.out.println(e.toString());
			
		} catch (ArrayIndexOutOfBoundsException x) {
			
			System.out.println(x.toString());
			
		} finally {
			
			System.out.println("##### ¼«ÆÒÁö : ±ëÁ¤¾ð");
			
		}
		
		System.out.println("Final");
		
	}

}
