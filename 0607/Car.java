
public class Car {

	public static void main(String[] args) {
		Tire t[] = new Tire[4];
		
		t[0] = new Tire("�� / ����");
		t[1] = new Tire("�� / ������");
		t[2] = new Tire("�� / ����");
		t[3] = new Tire("�� / ������");
	}

}

class Tire {
	String position;
	
	Tire(String position){
		this.position = position;
		System.out.println(position + " Ÿ�̾� : ���� �Ϸ�");
	}
	
}
