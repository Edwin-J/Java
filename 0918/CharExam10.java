import java.io.*;

class MyFilter extends FilterReader {

	protected MyFilter(Reader in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int input = super.read();
		
		if (input != -1)
			input = Character.toUpperCase( (char) input );
		
		return input;
	}
	
}

public class CharExam10 {

	public static void main(String[] args) throws Exception {
		
		Reader in = new MyFilter(new FileReader("input.txt"));
		
		int input;
		
		while( (input = in.read()) != -1)
			System.out.print( (char) input );
		
		in.close();
		
	}

}
