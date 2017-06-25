
interface Soundable {
	void sound();
}
interface Movable {
	public abstract void move();
}

class Cat implements Soundable, Movable {

	@Override
	public void move() {
		System.out.println("고양이가 날렵하게 움직이다.");
	}

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		c.move();

	}

}
