import java.util.Scanner;

class Point {
	private int x;
	private int y;
	
	public Point() {	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x : " + x + ", y : " + y ;
	}
}

class Point3D extends Point {
	private int z;
	
	public Point3D() {	}
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public String getLocation() {
		return super.getLocation() + ", z : " + z;
	}
}

public class Sangsok03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x ��ǥ �Է� : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ �Է� : ");
		int y = sc.nextInt();
		System.out.print("z ��ǥ �Է� : ");
		int z = sc.nextInt();
		
		Point3D p = new Point3D(x, y, z);
		System.out.println(p.getLocation());
		sc.close();
	}

}
