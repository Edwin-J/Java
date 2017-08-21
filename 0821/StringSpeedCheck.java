package java0821.ex01;

public class StringSpeedCheck {

	public static void main(String[] args) {
		
		String str1 = "Sunrin";
		String str2 = "Web";
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++)
			str1 = str1 + str2;
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);

	}

}
