package s20415오민재ex09;

import java.util.Scanner;

public class Challenge09 {

	public static void main(String[] args) {
		int input;
		Number n = new Number();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("정수 입력 >> ");
			input = sc.nextInt();
			if(input == 0)
				break;
			n.add(input);
		}
		System.out.println("Sum : " + n.getSum());
		System.out.println("Max : " + n.getMax());
	}

}

class Number{
	int sum = 0;
	int max = 0;
	
	public void add(int n){
		sum += n;
		max = max > n ? max : n;
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	
}