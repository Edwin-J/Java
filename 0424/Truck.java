import javax.swing.plaf.synth.SynthSeparatorUI;

public class Truck extends Car{

	public Truck(String color) {
		this.color = color;
	}
	
	public void move(){
		System.out.println("Ʈ���� �����δ�.");
	}
	
	public void printInfo(){
		System.out.print("Ʈ�� ������ : ");
		this.move();
		System.out.print("�� ������ : ");
		super.move();
	}
	
}
