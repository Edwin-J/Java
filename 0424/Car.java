
public class Car {
	int speed;
	String color;
	String brand;
	
	public Car (int speed, String color, String brand) {
		this(color);
		this.speed = speed;
		this.brand = brand;
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(){
		
	}

	public void move(){
		System.out.println("���� �����δ�.");
	}
	
	public static void main(String[] args) {
		Car c = new Car(0, "������", "����");
		System.out.println(c.speed + c.color + c.brand);
	}

}
