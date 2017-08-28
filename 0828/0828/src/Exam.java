import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		int bin = 0;
		
		try {
			is = new FileInputStream("a.jpg");
			os = new FileOutputStream("b.jpg");
			while((bin = is.read()) != -1) {
				os.write(bin);
			}
		} catch (IOException e) {
			
		}

	}

}
