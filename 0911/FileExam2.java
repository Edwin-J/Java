import java.io.File;

public class FileExam2 {

	public static void main(String[] args) {
		int files = 0;
		int dirs = 0;
		
		File f = new File(".");
		File[] fs = f.listFiles();
		for (File F : fs) {
			if(F.isDirectory())
				dirs++;
			else 
				files++;
			System.out.println(F.getName());
		}
		System.out.println("���� ���� : " + files);
		System.out.println("���丮 ���� : " + dirs);
	}

}
