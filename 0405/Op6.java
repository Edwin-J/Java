
public class Op6 {

	public static void main(String[] args) {
		int x = 10;
		int y = -10;
		int absX = (x > 0) ? x : x * (-1);
		int absY = (y > 0) ? y : y * (-1);
		
		System.out.println("x = " + x + "일 때, x의 절댓값은 " + absX);
		System.out.println("y = " + y + "일 때, y의 절댓값은 " + absY);

	}

}
