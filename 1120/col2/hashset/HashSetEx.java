package col2.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> ex = new HashSet<>();
		ex.add("������");
		ex.add("�Ķ���");
		ex.add("�����");
		System.out.println("�ݷ��� ũ��: " + ex.size());
		
		System.out.println("== ���׷����ͷ� ��� ==");
		Iterator<String> myInterator = ex.iterator();
		while(myInterator.hasNext())
			System.out.println(myInterator.next());
	}

}
