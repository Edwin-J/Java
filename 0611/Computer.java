
public class Computer {
	public String brand;
	public int price;
	
	public Computer(){}
	public Computer(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
	
	public void print(){
		System.out.print(brand + " ��ǻ�� : ");
		System.out.println(price + "��.");
	}
	
}
