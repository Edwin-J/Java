class P {
	public P (){
		System.out.println("P ������");
	}
	public P(int i){
		System.out.println("P(int) ������");
	}
}
public class C extends P{

	public C(){
		super(3); // �θ�Ŭ���� ������ ����� ȣ�� (��� JVM�� �ڵ� ȣ��)
		System.out.println("C() ������");
	}
	
	public C(String name){
		super();
		System.out.println("C() ������ : " + name);
	}
	
	public static void main(String[] args) {
		C Child = new C("ȫ�浿");
	}

}
