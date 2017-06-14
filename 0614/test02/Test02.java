package test02;

class Parent {
	public void speak() {
		System.out.println("저는 부모 객체입니다.");
	}
}

class Child extends Parent {
	public void speak() {
		System.out.println("저는 자식 객체입니다.");
	}
}

public class Test02 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.speak();
	}

}
