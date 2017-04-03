package op;

public class Op2 {

	public static void main(String[] args) {
		boolean b;
		int num1 = 25, num2 = 34;
		b = num1 <= num2;
		
		System.out.println(num1 + "<=" + num2 + "의 값은 " + b + "이다.");
		
		if(10 == 10.0F) System.out.println("S");
		if(num1 <= num2) System.out.println("U");
		if('A' >= 65) System.out.println("N");
		if('0' != 0) System.out.println("R");
		if(num2 < num1) System.out.println("I");
		if(num1 >= num2) System.out.println("N");

	}

}
