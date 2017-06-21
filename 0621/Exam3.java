
interface Soundable {
	public abstract void soundUp();
	void soundDown();
}

interface AdvancedSoundable extends Soundable {
	public abstract void soundOff();
}

class Tv implements AdvancedSoundable {
	public void soundUp() { System.out.println("볼륨을 높이다."); }
	public void soundDown() { System.out.println("볼륨을 낮추다."); }
	public void soundOff() { System.out.println("무음 처리하다."); }
}

public class Exam3 {

	public static void main(String[] args) {
		AdvancedSoundable tv = new Tv();
		tv.soundUp();
		tv.soundDown();
		tv.soundOff();
	}

}
