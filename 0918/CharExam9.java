import java.io.*;

public class CharExam9 {

	public static void main(String[] args) throws Exception {
		File file = new File("output.txt");
		PrintWriter ex = new PrintWriter(file);
		
		ex.printf("%d + %d = %d\n", 1, 2, 1+2);
		ex.println("�層��.");
		ex.print("��ȸ��.");
		
		ex.close();

	}

}
