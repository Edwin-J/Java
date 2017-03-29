
public class ArrayExam {

	public static void main(String[] args) {
		int jang[] = new int[5];
		// int jang[] = new int[] {10, 20, 30, 40, 50}
		// int jang[] = {10, 20, 30, 40, 50}
		
		for(int i=0; i < jang.length; i++){
			jang[i] = (i + 1) * 10;
			System.out.println(jang[i]);
		}
		
	}

}
