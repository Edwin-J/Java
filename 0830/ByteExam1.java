import java.io.*;

public class ByteExam1 {

	public static void main(String[] args) throws IOException {
	
		byte[] b = new byte[1024];
		int i = System.in.read(b);
		System.out.write(b, 0, i);
		System.out.flush();
		
	}
}
