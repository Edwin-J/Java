
class Person {
	public void think(){
		System.out.println("나는 생각한다. 고로 존재한다.");
	}
}

class Student extends Person {
	public void think(){
		System.out.println("자식클래스인 Student의 메소드");
	}
	public void study(){
		System.out.println("나는 공부한다. 고로 행복하다.");
	}
}

class PersonTest extends Student {
	public static void main(String[] args){
		Person p = new Student();
		p.think();
		((Student) p).study();
	}
}