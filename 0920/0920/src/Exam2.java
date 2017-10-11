import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Exam2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("out.data");
		ObjectOutputStream out = new ObjectOutputStream(os);
		
		out.writeObject(new Member("±ëÁ¤¾ð"));
		out.writeObject(new Member("Å· Á¤ ¿ø"));
		out.writeObject(new String("¹®ÀÚ¿­ ¹«¾ù"));
		out.writeObject(new Teacher("¿Õ·Ä½Ü"));
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.data"));
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		in.close();
	}

}
