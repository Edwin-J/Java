package in1.memberInner;

class Outter {   // �ܺ�Ŭ����
	private String name;
	public Outter(String name) {
		this.name = name;
	}
	class Inner { // ����Ŭ���� (��� ���� Ŭ����)
		private int age;
		public Inner(int age) {
			this.age = age;
		}
		public void printInfo() {
			System.out.println("name: "+name+", age: "+age);
		}
	}                                                         
}
public class InnerApp {
	public static void main(String[] args) {
		Outter out = new Outter("ȫ�浿");      // �ܺ�Ŭ����
		Outter.Inner in = out.new Inner(19);   // ����Ŭ����
//		Outter.Inner in = new Outter("ȫ�浿").new Inner(19);
		in.printInfo();
	}
}
