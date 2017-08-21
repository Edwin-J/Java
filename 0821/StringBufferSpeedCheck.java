package java0821.ex01;

public class StringBufferSpeedCheck {

	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer("Sunrin");
		StringBuffer str2 = new StringBuffer("Web");
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++)
			str1.append(str2);
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}
