class Parent {
	public Parent(){
		
	}
	
	public Parent(String name){
		System.out.println("�θ� ����Ʈ ������ : " + name);
	}
}

public class Child extends Parent{
	public Child(String name){
		super("ȫ�浿");
		System.out.println("�ڽ� ����Ʈ ������ : " + name + "Jr.");
	}
	
	public static void main (String[] args){
		new Child("ȫ�浿");
	}
}
