package test03;

public class Exam03 {

	public static void drive(Car obj) {
		if (obj instanceof Bus) ( (Bus)obj ).run();
		else obj.drive();
	}
	
	public static void main(String[] args) {
		drive(new Bus());
		drive(new Car());
	}

}
