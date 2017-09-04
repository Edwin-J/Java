package exam;

import java.io.FileInputStream;

public class Exam2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("c:\\windows\\system.ini");
		
		int i;
		
		while( true )
		{
			i = fi.read();
			if(i==-1)
			{
				break;
			}
			System.out.write(i);
		}

		fi.close();
	}

}
