package exam;

import java.io.*;

public class Exam1 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(System.in);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));
		int i;
		
		while(true) {
			i = bis.read();
			if (i == -1)
				break;
			bos.write(i);
		}

		bos.close();
		bis.close();
		
	}

}
