package in3.localInner;

class Outter {
	private String name;
	public Outter(String name) {
		this.name = name;
	}
	public void method() {
		class Inner { // ����Ŭ���� (���� ���� Ŭ����)
			private int age;
			public Inner(int age) {
				this.age = age;
			}
			public void printInfo() {
				System.out.println("name: "+name+", age: "+age);
			}
		}                                                       
		Inner in = new Inner(19);
		in.printInfo();
	}
}
public class LocalApp {
	public static void main(String[] args) {
		Outter out = new Outter("ȫ�浿");
		out.method();
	}
}
