import java.io.*;

public class ByteExam3 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bi = new BufferedInputStream(System.in);
		BufferedOutputStream bo = new BufferedOutputStream(System.out);
		int a;
		
		while((a=bi.read())!= -1){
			bo.write(a);
			if(a=='\n')
				bo.flush();
		}
		bo.close();
		bi.close();

	}

}
