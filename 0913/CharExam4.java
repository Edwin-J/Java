import java.io.*;

public class CharExam4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = 
				new BufferedReader
				(new InputStreamReader(System.in));
		
		String inp = null;
		
		while (true) {
			inp = br.readLine();
			if (inp == null)
				break;
			System.out.println(inp);
		}
		
	}

}
