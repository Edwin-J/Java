import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharExam {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		int inp;
		
		while( (inp = isr.read()) != -1 )
			System.out.print((char)inp);

		is.close();
		
	}

}
