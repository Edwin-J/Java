class P {
	public P (){
		System.out.println("P 생성자");
	}
	public P(int i){
		System.out.println("P(int) 생성자");
	}
}
public class C extends P{

	public C(){
		super(3); // 부모클래스 생성자 명시적 호출 (없어도 JVM이 자동 호출)
		System.out.println("C() 생성자");
	}
	
	public C(String name){
		super();
		System.out.println("C() 생성자 : " + name);
	}
	
	public static void main(String[] args) {
		C Child = new C("홍길동");
	}

}
