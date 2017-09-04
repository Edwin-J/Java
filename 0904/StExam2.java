package exam;

import java.util.StringTokenizer;

public class StExam2 {

	public static void main(String[] args) {
		String str = "sunrin.hs.kr";
		StringTokenizer st = new StringTokenizer(str, ".");
		
		for (int i = 0; i < 3; i ++) {
			String[] s = new String[3];
			s[i] = st.nextToken();
			System.out.println(s[i]);
			System.out.println("Rest Tokens : " + st.countTokens() + "\n");
		}

	}

}
