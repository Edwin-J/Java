package s20415������ex11;

import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Overload a = new Overload();
		a.add();
		System.out.print("���� �� �� �Է� >> ");
		System.out.println(a.add(sc.nextInt()));
		System.out.print("���� �� �� �Է� >> ");
		System.out.println(a.add(sc.nextInt(), sc.nextInt()));
		sc.close();
	}

}

class Overload{
	public void add(){
		System.out.println("�Ű� ���� ����");
	}
	
	public int add(int a){
		return a + a;
	}
	
	public int add(int a, int b){
		return a + b;
	}
}
