
interface Soundable {
	void sound();
}

interface Movable {
	void move();
}

class Cat implements Soundable, Movable {

	@Override
	public void move() {
		System.out.println("����̰� �����ϰ� �����̴�.");
	}

	@Override
	public void sound() {
		System.out.println("�߿�");
	}
	
}

public class Exam4 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		c.move();
	}

}
