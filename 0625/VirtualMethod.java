
class Sunrin {
	String s = "선린";
	Sunrin() { s = s + "인터넷고"; }
	String get() { return "멋진 선린인"; }
}

class Web extends Sunrin {
	String s = "웹운영과";
	Web() { s = super.s + s; }
	String get() { return s; }
}

public class VirtualMethod {

	public static void main(String[] args) {
		Sunrin sun = new Web();
		System.out.println(sun.s);
		System.out.println(sun.get());

	}

}
