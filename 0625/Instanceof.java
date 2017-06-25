
class Buyer {
	void buy(Seller s, Fruit obj) {
		System.out.println(s.sell(obj) + "�� ������.");
	}
}
class Seller {
	String sell(Fruit obj) {
		if (obj instanceof Apple) return "��� 1�ڽ�";
		else if (obj instanceof Banana) return "�ٳ��� 1�ڽ�";
		else return "������ 1�ڽ�";
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
