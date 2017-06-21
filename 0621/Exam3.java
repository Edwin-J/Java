
interface Soundable {
	public abstract void soundUp();
	void soundDown();
}

interface AdvancedSoundable extends Soundable {
	public abstract void soundOff();
}

class Tv implements AdvancedSoundable {
	public void soundUp() { System.out.println("������ ���̴�."); }
	public void soundDown() { System.out.println("������ ���ߴ�."); }
	public void soundOff() { System.out.println("���� ó���ϴ�."); }
}

public class Exam3 {

	public static void main(String[] args) {
		AdvancedSoundable tv = new Tv();
		tv.soundUp();
		tv.soundDown();
		tv.soundOff();
	}

}
