package s20415오민재ex11;

import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Overload a = new Overload();
		a.add();
		System.out.print("정수 한 개 입력 >> ");
		System.out.println(a.add(sc.nextInt()));
		System.out.print("정수 두 개 입력 >> ");
		System.out.println(a.add(sc.nextInt(), sc.nextInt()));
		sc.close();
	}

}

class Overload{
	public void add(){
		System.out.println("매개 변수 없음");
	}
	
	public int add(int a){
		return a + a;
	}
	
	public int add(int a, int b){
		return a + b;
	}
}
