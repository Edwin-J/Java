
public class ZizonGwangjun {

	public static void main(String[] args) {
		Zizon z = new Zizon(false, "장광준");
		
		z.human = false;
		z.gender = "여성";
		
		z.goToilet("광준이");
		
		System.out.println("광준이는 " + z.gender + "이고, " +
				"광준의 사람여부는 " + z.human + "입니다.");
		
		z.print();
		z.print("이한수");

		z.print(2, "광준이");
		z.print("장광준", 22);
	}

}
