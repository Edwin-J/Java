
interface Soundable {
	public abstract void sound();
}

class Bird implements Soundable {

	@Override
	public void sound() {
		System.out.println("±±");
	}

}

public class Exam2 {

	public static void main(String[] args) {
		Soundable s = new Bird();
		s.sound();
	}

}
