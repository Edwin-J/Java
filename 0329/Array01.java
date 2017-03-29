
public class Array01 {

	public static void main(String[] args) {
		int a[];
		a = new int[3];
		
		int b[] = new int[2];
		b[0] = 10; b[1] = 20;
		
		int c[] = new int[] {5, 6, 7};
		
		System.out.println("Length of Array a = " + a.length);
		for(int n = 0; n < a.length; n++){
			System.out.println("a["+n+"] = " + a[n] + " ");
		}
		System.out.println("Length of Array b = " + b.length);
		for(int n = 0; n < b.length; n++){
			System.out.println("b["+n+"] = " + b[n] + " ");
		}
		System.out.println("Length of Array c = " + c.length);
		for(int n = 0; n < c.length; n++){
			System.out.println("c["+n+"] = " + c[n] + " ");
		}
	}

}
