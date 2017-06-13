import java.util.Scanner;

class Thing {
	private String brand;
	
	public Thing() {	}
	public Thing(String brand) {
		this.brand = brand;
	}
	
	public void printInfo(){
		System.out.println("브랜드명 : " + this.brand);
	}
}

class Watch extends Thing {
	public Watch() {	}
	public Watch(String brand) {
		super(brand);
	} 
}

public class Sangsok01 {

	public static void main(String[] args) {
		System.out.print("시계 브랜드 이름 입력 : ");
		Scanner sc = new Scanner(System.in);
		String brand = sc.next();
		
		new Watch(brand).printInfo();
	}

}
