
public class Car {

	public static void main(String[] args) {
		Tire t[] = new Tire[4];
		
		t[0] = new Tire("앞 / 왼쪽");
		t[1] = new Tire("앞 / 오른쪽");
		t[2] = new Tire("뒤 / 왼쪽");
		t[3] = new Tire("뒤 / 오른쪽");
	}

}

class Tire {
	String position;
	
	Tire(String position){
		this.position = position;
		System.out.println(position + " 타이어 : 장착 완료");
	}
	
}
