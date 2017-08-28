
public class ExceptionExam1 {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int result = 0;
		
		try {
			result = array[12];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 잘못되었습니다.");
		}
		
		
		System.out.println("저는 실행이 될까요?");

	}

}
