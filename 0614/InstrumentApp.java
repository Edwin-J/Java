import java.util.ArrayList;

class Instrument {
	void play() {
		System.out.println("Instrument 연주");
	}
}

class Trumpet extends Instrument {
	void play() {
		System.out.println("Trumpet 연주");
	}
}

class Violin extends Instrument {
	void play() {
		System.out.println("Violin 연주");
	}
}

class Flute extends Instrument {
	void play() {
		System.out.println("Flute 연주");
	}
}

public class InstrumentApp {

	public static void main(String[] args) {
		ArrayList<Instrument> list = new ArrayList<Instrument>();
		list.add(new Trumpet());
		list.add(new Violin());
		list.add(new Flute());
		
		for (Instrument i : list)
			i.play();
	}

}
