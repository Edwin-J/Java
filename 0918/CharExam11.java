import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class CharExam11 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(new File("data.txt"));
		BufferedReader br = new BufferedReader(fr);
		String in = "", data = "";
		
		while( (in = br.readLine()) != null)
			data = data + in + "\t";
			
		StringTokenizer st = new StringTokenizer(data);
		
		String name[] = new String[4];
		String adress[] = new String[4];
		double math[] = new double[4];
		double en[] = new double[4];
		double sum[] = new double[4];
		double avg[] = new double[4];
		
		System.out.println(
				"성명" + "\t" + "주소" + "\t" + "수학" + "\t" + 
				"영어" + "\t" + "합계" + "\t" + "평균");
		for (int i = 0; i < 4; i++) {
			name[i] = st.nextToken();
			adress[i] = st.nextToken();
			math[i] = Double.parseDouble(st.nextToken());
			en[i] = Double.parseDouble(st.nextToken());
			sum[i] = math[i] + en[i];
			avg[i] = sum[i] / 2.0;
			System.out.println(
					name[i] + "\t" + adress[i] + "\t" +
					math[i] + "\t" + en[i] + "\t" +
					sum[i] + "\t" + avg[i]);
		}
		br.close();
	}

}
