
public class Exam1 {

	public static void main(String[] args) {
		Student a = new Student("���Ѽ�");
		Student b = new Student("������");
		Teacher c = new Teacher("�շĽ�");
		Student d = new Student("���ؼ�");

		DanTalk room = new DanTalk(24);
		
		room.enter(a);
		room.enter(b);
		room.enter(c);
		
		System.out.println(room);
	}

}
