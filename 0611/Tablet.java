
public class Tablet extends Computer {

	private double display;
	
	public Tablet(){}
	public Tablet(String brand, int price, double display){
		super(brand, price);
		this.display = display;
	}
	
	public void print(){
		System.out.print(brand + " �º� : ");
		System.out.println(price + "��, " + display + "��ġ.");
	}
	
}
