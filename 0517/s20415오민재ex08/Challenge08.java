package s20415������ex08;

import java.util.Scanner;

public class Challenge08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog a = new Dog();
		Dog b = new Dog("�鱸");
		Dog c = new Dog("�Ͼ�", "�鱸");
		System.out.print("�۸��� �̸� �Է� : ");
		
		Dog d = new Dog(sc.next());
		sc.close();
	}

}

class Dog{
	public Dog(){
		System.out.println("�۸���");
	}
	
	public Dog(String name){
		System.out.println("�۸��� " + name);
	}
	
	public Dog(String color, String name){
		System.out.println(color + " " + name + " " + "�۸���");
	}
}