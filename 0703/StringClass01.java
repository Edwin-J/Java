
public class StringClass01 {

	public static void main(String[] args) {
		String s = "I Love You";
		System.out.println("s.length(): " + s.length());
		System.out.println("s.trim(): [" + s.trim() + "]");
		System.out.println("s.subString(3): " + s.substring(3));
		System.out.println("\"abcd\".subString(3): " + "abcd".substring(3));
		System.out.print("s.charAt(index): ");
		for (int i = 0; i < s.length(); i++)
			System.out.print(s.charAt(i));
		System.out.println("\n원래 문자열 s 출력: [" + s + "]");
	}

}
