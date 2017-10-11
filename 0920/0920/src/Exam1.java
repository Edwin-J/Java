
public class Exam1 {

	public static void main(String[] args) {
		Student a = new Student("ÀÌÇÑ¼ö");
		Student b = new Student("±ëÁ¤¾ğ");
		Teacher c = new Teacher("¿Õ·Ä½Ü");
		Student d = new Student("±èÁØ¼ö");

		DanTalk room = new DanTalk(24);
		
		room.enter(a);
		room.enter(b);
		room.enter(c);
		
		System.out.println(room);
	}

}
