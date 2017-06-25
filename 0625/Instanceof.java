
class Buyer {
	void buy(Seller s, Fruit obj) {
		System.out.println(s.sell(obj) + "를 구매함.");
	}
}
class Seller {
	String sell(Fruit obj) {
		if (obj instanceof Apple) return "사과 1박스";
		else if (obj instanceof Banana) return "바나나 1박스";
		else return "모듬과일 1박스";
	}
}
class Fruit {}
class Apple extends Fruit {}
class Banana extends Fruit {}

public class Instanceof {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Seller s = new Seller();
		
		b.buy( s, new Apple() );
		b.buy( s, new Banana() );

	}

}
