
class A {
	public void print() { show(); }
	public void show(){
		System.out.println("°´Ã¼ AÀÇ show()");
	}
}

class B extends A {
	public void print() { super.show(); }
	public void show(){
		System.out.println("°´Ã¼ BÀÇ show()");
	}
}

public class Example {
	public static void main(String args[]){
		A a = new B();
		a.print();
	}
}
