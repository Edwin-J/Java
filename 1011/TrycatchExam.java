
public class TrycatchExam {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(1);
			System.out.println(2 / 0);
			System.out.println(3);
		} catch (ArithmeticException e){
			System.out.println(4);
			System.out.println("���ܹ߻�");
			System.out.println(5);
		}
		System.out.println("����� �ɱ�� ?");
		System.out.println(6);
	}

}
