import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class CharExam12 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(new File("data.txt"));
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(new File("copydata.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		
		String in = "", data = "";
		
		while( (in = br.readLine()) != null )
			data = data + in + "\t";
		
		StringTokenizer st = new StringTokenizer(data);
		
		String name[] = new String[4];
		String adress[] = new String[4];
		Double math[] = new Double[4];
		Double en[] = new Double[4];
		Double sum[] = new Double[4];
		Double avg[] = new Double[4];
		
		for (int i = 0; i < 4; i++) {
			
			name[i] = st.nextToken();
			adress[i] = st.nextToken();
			math[i] = Double.parseDouble(st.nextToken());
			en[i] = Double.parseDouble(st.nextToken());
			sum[i] = math[i] + en[i];
			avg[i] = sum[i] / 2;
			
			bw.write(
					name[i] + "\t" + adress[i] + "\t" +
					math[i] + "\t" + en[i] + "\t" +
					sum[i] + "\t" + avg[i] + "\n");
			
		}
		br.close();
		bw.close();
	}

}
