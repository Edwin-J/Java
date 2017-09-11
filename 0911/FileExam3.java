import java.io.*;
import java.util.zip.*;

public class FileExam3 {

	public static void main(String[] args) throws Exception {
		File file = new File("java.zip");
		ZipInputStream zip = new ZipInputStream(new FileInputStream(file));
		OutputStream os = null;
		
		int input;
		ZipEntry entry;
		
		while( (entry = zip.getNextEntry()) != null ) {
			os = new FileOutputStream(entry.getName());
			
			while ( (input = zip.read()) != -1 )
				os.write(input);
			
			zip.closeEntry();
			os.close();
		}
		
		zip.close();

	}

}
