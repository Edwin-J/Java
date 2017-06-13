
class Father {
	public void say(){
		System.out.println("I am Father.");
	}
}

class Child extends Father {
	public void say(){
		System.out.println("I am Child.");
	}
}

public class Sangsok02 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.say();
	}

}
