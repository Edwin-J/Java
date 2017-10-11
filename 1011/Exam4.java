
public class Exam4 {

	public static void main(String[] args) {
		
		try {
			
			String str = null;
			System.out.println("문자열 : " + str.length());
			
		} catch (NullPointerException e) {
			System.out.println("객체 없음 : " + e.toString());
		} finally {
			System.out.println("프로그램 개발자 : 오민재");
		}

	}

}
