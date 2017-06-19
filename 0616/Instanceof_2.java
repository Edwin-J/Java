
class Car {	
	void drive() {
		System.out.println("자동차가 달립니다.");
	}
}
class Ambulance extends Car {
	void dispatch() {
		System.out.println("구급차가 달립니다.");
	}
}

class Bus extends Car {
	void run() {
		System.out.println("버스가 운행합니다.");
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
			System.out.println("C1 : 구급차 객체");
		
		if (c1 instanceof Car)
			System.out.println("C1 : 차 객체");
		
		if (c1 instanceof Object)
			System.out.println("C1 : 객체");
		
		System.out.println();
		
		if (c2 instanceof Ambulance)
			System.out.println("C2 : 구급차 객체");
		
		if (c2 instanceof Car)
			System.out.println("C2 : 차 객체");
		
		if (c2 instanceof Object)
			System.out.println("C2 : 객체");
		
		System.out.println();
		
		drive(new Car());
		drive(new Ambulance());
		drive(new Bus());
	}

}
