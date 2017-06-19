
class Car {	
	void drive() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
}
class Ambulance extends Car {
	void dispatch() {
		System.out.println("�������� �޸��ϴ�.");
	}
}

class Bus extends Car {
	void run() {
		System.out.println("������ �����մϴ�.");
	}
}
public class Instanceof_2 {
	
	public static void drive (Car obj) {
		if (obj instanceof Ambulance)
			((Ambulance)obj).dispatch();
		
		else if (obj instanceof Bus)
			((Bus)obj).run();
		
		else
			obj.drive();
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Ambulance();
		Ambulance c3 = (Ambulance) c2;
		
		if (c1 instanceof Ambulance)
			System.out.println("C1 : ������ ��ü");
		
		if (c1 instanceof Car)
			System.out.println("C1 : �� ��ü");
		
		if (c1 instanceof Object)
			System.out.println("C1 : ��ü");
		
		System.out.println();
		
		if (c2 instanceof Ambulance)
			System.out.println("C2 : ������ ��ü");
		
		if (c2 instanceof Car)
			System.out.println("C2 : �� ��ü");
		
		if (c2 instanceof Object)
			System.out.println("C2 : ��ü");
		
		System.out.println();
		
		drive(new Car());
		drive(new Ambulance());
		drive(new Bus());
	}

}
