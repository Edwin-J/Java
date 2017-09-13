import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharExam8 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = 
				new BufferedReader(new FileReader("c.txt"));
		BufferedWriter bw =
				new BufferedWriter(new FileWriter("cCopy.txt"));
		
		String inp = null;
		
		while (true) {
			inp = br.readLine();
			if (inp == null)
				break;
			
			bw.write(inp);
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}
