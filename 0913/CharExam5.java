import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharExam5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = 
				new BufferedReader
				(new FileReader("a.txt"));
		Writer w = new OutputStreamWriter( System.out );		
		
		String inp;
		
		while (true) {
			inp = br.readLine();
			if (inp == null)
				break;
			w.write(inp + "\n");
			w.flush();
		}
		
		br.close();

	}

}
