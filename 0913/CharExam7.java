import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharExam7 {

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = 
				new BufferedWriter(new FileWriter("c.txt"));
		
		bw.write("�������ͳݰ���б�");
		bw.newLine();
		bw.write("�����");
		bw.newLine();
		bw.write("2�г�");

		bw.close();

	}

}
