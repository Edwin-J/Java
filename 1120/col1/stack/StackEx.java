package col1.stack;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		// Lets use Hashset or HashMap;
		Stack<String> col = new Stack<>();
		col.push("ȫ�浿");
		col.push("�̸���");
		col.push("������");
		System.out.println(col.pop());
		System.out.println(col.pop());
		System.out.println(col.pop());
	}
}
