package s20415坷刮犁ex08;

import java.util.Scanner;

public class Challenge08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog a = new Dog();
		Dog b = new Dog("归备");
		Dog c = new Dog("窍踞", "归备");
		System.out.print("港港捞 捞抚 涝仿 : ");
		
		Dog d = new Dog(sc.next());
		sc.close();
	}

}

class Dog{
	public Dog(){
		System.out.println("港港捞");
	}
	
	public Dog(String name){
		System.out.println("港港捞 " + name);
	}
	
	public Dog(String color, String name){
		System.out.println(color + " " + name + " " + "港港捞");
	}
}