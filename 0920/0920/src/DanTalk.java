import java.util.ArrayList;

public class DanTalk {

//	private Mark[] array;
	private ArrayList<Mark> array;
//	private int index;
		
	public DanTalk(int size) {
//		array = new Student[size];
//		index = 0;
		array = new ArrayList<Mark>();
		System.out.println("����� ����");
	}
	
	public void enter (Object person) {
		if (person instanceof Mark) {
//			array[index] = (Mark) person;
			array.add((Mark)person);
//			index ++;
			System.out.println(person + ": ����");
		} else {
			System.out.println(person + ": ���� �Ұ�");
		}
	}

}
