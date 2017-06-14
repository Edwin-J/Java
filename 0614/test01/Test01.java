package test01;

import java.util.Scanner;

class Thing {
	private String brand;
	
	Thing(String brand) {
		this.brand = brand;
	}
	
	public void printInfo() {
		System.out.println("브랜드명 : " + this.brand);
	}
}

class Watch extends Thing {

	Watch(String brand) { super(brand); }
	
}

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시계 브랜드 이름 입력 : ");
		String brand = sc.next();
		
		Watch watch = new Watch(brand);
		watch.printInfo();
		sc.close();
	}

}
