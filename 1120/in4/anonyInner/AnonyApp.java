package in4.anonyInner;

interface Anony {
	public void method();
}
public class AnonyApp {
	public void exam(Anony a) {
		a.method();
	}
	public static void main(String[] args) {
		AnonyApp in = new AnonyApp();
		in.exam(  new Anony() { // �͸� ���� Ŭ����
			@Override
			public void method() {
				System.out.println("�͸�Ŭ����");
			}
		}  ); // ";"�� �������� ������.
	}
}
