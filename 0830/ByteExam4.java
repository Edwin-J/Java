import java.io.*;

public class ByteExam4 {

	public static void main(String[] args) throws Exception {
		InputStream fi = new FileInputStream("Heavy.data");
		BufferedInputStream bin = new BufferedInputStream(fi);
		FileOutputStream fo = new FileOutputStream("copy.data");
		BufferedOutputStream bos = new BufferedOutputStream(fo);
		int i;
		
		int copyByte = 0;
		long start = System.currentTimeMillis();
		while(true) {
			i = bin.read();
			if(i == -1) break;
			bos.write(i);
			copyByte++;
		}
		
		long end = System.currentTimeMillis();
		bos.close();
		bin.close();
		
		System.out.println(end-start);
		System.out.println("복사된 파일은 " + copyByte + "");
		
	}

}
