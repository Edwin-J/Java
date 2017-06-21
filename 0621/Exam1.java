
interface GwangjunJang {
	public abstract void jangFun();
	void kingFun();
	public static final String name = "킹정원";
	public String cowIn = "Sunrin";
}

class Jang implements GwangjunJang {

	@Override
	public void jangFun() {
		System.out.println("지존 장광준");

	}

	@Override
	public void kingFun() {
		System.out.println("바나나 킹정원");

	}

}

public class Exam1 {

	public static void main(String[] args) {
		GwangjunJang j = new Jang();
		j.jangFun();
		j.kingFun();
		System.out.println(j.name);
		System.out.println(j.cowIn);
	}

}
