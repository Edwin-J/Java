import javax.swing.plaf.synth.SynthSeparatorUI;

public class Truck extends Car{

	public Truck(String color) {
		this.color = color;
	}
	
	public void move(){
		System.out.println("트럭이 움직인다.");
	}
	
	public void printInfo(){
		System.out.print("트럭 움직임 : ");
		this.move();
		System.out.print("차 움직임 : ");
		super.move();
	}
	
}
