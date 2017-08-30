import java.io.IOException;
import java.io.OutputStream;

public class ByteExam2 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		os.write(72);os.write(101);os.write(108);
		os.write(108);os.write(111);os.write(0);

		os.write(87);os.write(111);os.write(114);
		os.write(108);os.write(100);os.write(33);
		
		os.close();
		
	}

}
