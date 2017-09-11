import java.io.File;

public class FileExam1 {

	public static void main(String[] args) {
		File file = new File("./src", "FileExam1.java");
		System.out.println("파일의 이름은? " + file.getName());
		System.out.println("파일이 존재하는지? " + file.exists());
		System.out.println("파일인가요? " + file.isFile());
		System.out.println("디렉토리인가요? " + file.isDirectory());
		System.out.println("파일의 바이트 크기는? " + file.length());
		
		System.out.println("현재 디렉토리의 내용은? ");
		String[] list = new File("./src").list();
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i]);

	}

}
