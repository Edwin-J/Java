
public class ExceptionExam1 {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int result = 0;
		
		try {
			result = array[12];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� �߸��Ǿ����ϴ�.");
		}
		
		
		System.out.println("���� ������ �ɱ��?");

	}

}
