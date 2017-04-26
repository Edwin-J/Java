class Parent {
	public Parent(){
		
	}
	
	public Parent(String name){
		System.out.println("부모 디폴트 생성자 : " + name);
	}
}

public class Child extends Parent{
	public Child(String name){
		super("홍길동");
		System.out.println("자식 디폴트 생성자 : " + name + "Jr.");
	}
	
	public static void main (String[] args){
		new Child("홍길동");
	}
}
