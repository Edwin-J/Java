package exam;

import java.util.StringTokenizer;

public class StExam4 {

	public static void main(String[] args) {
		String str = "1+2+3+4+5+6+7+8+9+10";
		StringTokenizer stn = new StringTokenizer(str, "+");
		
		int sum = 0;
		while(stn.hasMoreTokens()){
			sum = sum + Integer.parseInt(stn.nextToken());
		}
		
		System.out.println(str + "의 합계는 " + sum + "입니다.");
		
	}

}
