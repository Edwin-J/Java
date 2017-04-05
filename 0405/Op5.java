
public class Op5 {

	public static void main(String[] args) {
		int num1 = 5; /* 00000101 */
		int num2 = 3; /* 00000011 */
		
		System.out.println(num1 & num2); /* 00000001 */
		System.out.println(num1 | num2); /* 00000111 */
		System.out.println(num1 ^ num2); /* 00000110 */

	}

}
