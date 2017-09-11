import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileExam4 {

	public static void main(String[] args) throws Exception {
		
		String[] name = {"duke1.jpg", "duke2.jpg", "duke3.jpg"};
		FileInputStream fi = null;
		
		FileOutputStream fo = new FileOutputStream("res.zip");
		ZipOutputStream zo = new ZipOutputStream(fo);
		
		int input;
		for (String s : name) {
			zo.putNextEntry(new ZipEntry(s));
			fi = new FileInputStream(s);
			
			while ( (input = fi.read()) != -1 )
				zo.write(input);
			
			zo.closeEntry();
			fi.close();
		}
		zo.close();
	}

}
