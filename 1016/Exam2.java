
class A implements Cloneable {
	
	int a;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class Exam2 {

	public static void main(String[] args) {

		A a1 = new A();
		a1.a = 10;
		A a2 = null;
		
		try {
			
			a2 = (A) a1.clone();
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println("a1 °´Ã¼ : " + a1.a);
		System.out.println("a2 °´Ã¼ : " + a2.a);
		
	}

}
