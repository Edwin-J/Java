package th1.intro;
class Blue {
	public void run() {
		while(true) {
			System.out.println("û�� �÷�........!");
		}
	}
}
class White {
	public void run() {
		while(true) {
			System.out.println("��� �÷�!");
		}
	}
}
public class ThreadEx {
	public static void main(String[] args) {
		new Blue().run();  // ���ѷ����� ����
		new White().run(); // �ᱹ ������� ����
	}
}
