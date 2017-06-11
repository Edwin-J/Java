
public class Laptop extends Computer{
	
	private int weight;
	
	public Laptop(){}
	public Laptop(String brand, int price, int weight){
		super(brand, price);
		this.weight = weight;
	}
	
	public void print(){
		System.out.print(brand + " ��Ʈ�� : ");
		System.out.println(price + "��, " + weight + "g.");
	}
	
}
