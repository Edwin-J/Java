import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Exam2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("out.data");
		ObjectOutputStream out = new ObjectOutputStream(os);
		
		out.writeObject(new Member("������"));
		out.writeObject(new Member("ŷ �� ��"));
		out.writeObject(new String("���ڿ� ����"));
		out.writeObject(new Teacher("�շĽ�"));
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.data"));
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		in.close();
	}

}
