
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
		
		Student s1 = new Student("ȫ�浿");
		Student s2 = null;
		
		try {
			s2 = (Student)s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("�л�1�� �̸� : " + s1.getName());
		System.out.println("�л�2�� �̸� : " + s2.getName());

	}

}
