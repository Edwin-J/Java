import java.io.File;

public class FileExam1 {

	public static void main(String[] args) {
		File file = new File("./src", "FileExam1.java");
		System.out.println("������ �̸���? " + file.getName());
		System.out.println("������ �����ϴ���? " + file.exists());
		System.out.println("�����ΰ���? " + file.isFile());
		System.out.println("���丮�ΰ���? " + file.isDirectory());
		System.out.println("������ ����Ʈ ũ���? " + file.length());
		
		System.out.println("���� ���丮�� ������? ");
		String[] list = new File("./src").list();
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i]);

	}

}
