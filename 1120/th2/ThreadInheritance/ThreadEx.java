package th2.ThreadInheritance;

class Blue extends Thread { // ThreadŬ���� ���
	public void run() {//������ �����췯�� ������ ����� ȣ��
		while(true) {
			System.out.println("û�� �÷�.....!");
		}
	}
}
class White extends Thread { // ThreadŬ���� ���
	public void run() {//������ �����췯�� ������ ����� ȣ��
		while(true) {
			System.out.println("��� �÷�!");
		}
	}
}
public class ThreadEx { 
	public static void main(String[] args) {
		// --�����带 ����� Ŭ�������� run()�� �����ϸ�,
		// --��ü�� ������ ��� ���� �� run()�� ȣ��� ����ȴ�.
		// �� ��ü�� ������ ���� : run�޼ҵ� X. start�޼ҵ� O
		new Blue().start();  
		new White().start(); 
	}
}
