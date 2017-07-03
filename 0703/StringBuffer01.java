
public class StringBuffer01 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("WangLyul");
		System.out.println(s.append(" is a teacher!"));
		System.out.println(s.insert(14, "good "));
		System.out.println(s.replace(14,  18,  "great"));
		System.out.println(s.reverse());
		System.out.println("문자열  s 출력 : " + s);

	}

}
