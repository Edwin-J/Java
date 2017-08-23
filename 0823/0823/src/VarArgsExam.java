
public class VarArgsExam {

	public static void main(String[] args) {
		System.out.println( add(1) );
		System.out.println( add(1, 1) );
		System.out.println( add(1, 1, 1) );
		System.out.println( add(1, 1, 1, 1) );
	}
	
	public static int add(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++)
			sum = sum + num[i];
		return sum;
	}

}
