import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharExam7 {

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = 
				new BufferedWriter(new FileWriter("c.txt"));
		
		bw.write("선린인터넷고등학교");
		bw.newLine();
		bw.write("웹운영과");
		bw.newLine();
		bw.write("2학년");

		bw.close();

	}

}
