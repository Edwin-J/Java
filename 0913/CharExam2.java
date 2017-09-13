import java.io.FileReader;
import java.io.FileWriter;

public class CharExam2 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("text.txt");
		FileWriter fw = new FileWriter("copy.txt");
		
		int inp;
		
		while ( (inp = fr.read()) != -1 ) {
			fw.write(inp);
		} 
		
		fw.close();
		fr.close();

	}

}
