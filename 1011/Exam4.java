
public class Exam4 {

	public static void main(String[] args) {
		
		try {
			
			String str = null;
			System.out.println("���ڿ� : " + str.length());
			
		} catch (NullPointerException e) {
			System.out.println("��ü ���� : " + e.toString());
		} finally {
			System.out.println("���α׷� ������ : ������");
		}

	}

}
