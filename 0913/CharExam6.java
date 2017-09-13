import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharExam6 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = 
				new BufferedReader
				(new InputStreamReader(System.in));
		
		String a = null;
		String b = null;
		
		System.out.print("Enter the String(정수 1개) : ");
		a = br.readLine();
		System.out.print("Enter the String(정수 1개) : ");
		b = br.readLine();
		
		int sum = Integer.parseInt(a) + Integer.parseInt(b);
		double ave = (double)sum / 2;
		
		System.out.println( a + " + " + b + " = " + sum );
		System.out.println( "평균 = " + ave);

	}

}
