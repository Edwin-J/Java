package test02;

class Parent {
	public void speak() {
		System.out.println("���� �θ� ��ü�Դϴ�.");
	}
}

class Child extends Parent {
	public void speak() {
		System.out.println("���� �ڽ� ��ü�Դϴ�.");
	}
}

public class Test02 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.speak();
	}

}
