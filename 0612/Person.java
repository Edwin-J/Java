
class Person {
	public void think(){
		System.out.println("���� �����Ѵ�. ��� �����Ѵ�.");
	}
}

class Student extends Person {
	public void think(){
		System.out.println("�ڽ�Ŭ������ Student�� �޼ҵ�");
	}
	public void study(){
		System.out.println("���� �����Ѵ�. ��� �ູ�ϴ�.");
	}
}

class PersonTest extends Student {
	public static void main(String[] args){
		Person p = new Student();
		p.think();
		((Student) p).study();
	}
}