package th3.RunnableImplements;

class Blue implements Runnable { // Runnable ����
	public void run() {//������ �����췯�� ������ ����� ȣ��
		while(true) {
			System.out.println("û�� �÷�.....!");
		}
	}
}
class White implements Runnable { // Runnable ����
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
		new Thread(new Blue()).start();  
		new Thread(new White()).start(); 
	}
}
