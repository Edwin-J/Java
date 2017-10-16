
class Student implements Cloneable {
	
	private String name;
	public Student(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	} 
	
}

public class Exam3 {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동");
		Student s2 = null;
		
		try {
			s2 = (Student)s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("학생1의 이름 : " + s1.getName());
		System.out.println("학생2의 이름 : " + s2.getName());

	}

}
