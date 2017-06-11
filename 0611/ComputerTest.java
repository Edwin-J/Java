
public class ComputerTest {

	public static void main(String[] args) {
		Computer com1 = new Computer("Apple", 2000000);
		Laptop com2 = new Laptop("LG", 1500000, 940);
		Tablet com3 = new Tablet("»ï¼º", 800000, 10.1);
		
		com1.print();
		com2.print();
		com3.print();
	}

}
