package exam;

import java.util.StringTokenizer;

public class StExam1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("사과 배 복숭아");
		
		System.out.println("Tokens : " + st.countTokens() + "\n");
		
		for (int i = 0; i < 3; i ++) {
			String[] s = new String[3];
			s[i] = st.nextToken();
			System.out.println(s[i]);
			System.out.println("Rest Tokens : " + st.countTokens() + "\n");
		}

	}

}
