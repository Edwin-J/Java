
public class TV {
	String brand;
	
	public TV(String brand){
		this.brand = brand;
	}
	
	public static void main(String[] args) {
		TV tvArr[] = new TV[3];
		
		tvArr[0] = new TV("SAMSEONG");
		tvArr[1] = new TV("RG");
		tvArr[2] = new TV("SHAOME");
		
		for (TV tv : tvArr)
			System.out.println(tv.brand + " TV");
		
	}

}
