package in2.staticInner;

class Outter {
	private String name;
	public Outter(String name) {
		this.name = name;
	}
	static class Inner { // ����Ŭ���� (���� ���� Ŭ����)
		private int age;
		static String dept = "�����";
		public Inner(int age) {
			this.age = age;
		}
		public void printInfo() {
			System.out.println("�Ҽ�: "+dept+", age: "+age);
		}
	}                                                        
}
public class StaticApp {
	public static void main(String[] args) {
		Outter.Inner in = new Outter.Inner(20);
		in.printInfo();
		System.out.println(Outter.Inner.dept);
	}
}
