import java.util.ArrayList;

class Instrument {
	void play() {
		System.out.println("Instrument 楷林");
	}
}

class Trumpet extends Instrument {
	void play() {
		System.out.println("Trumpet 楷林");
	}
}

class Violin extends Instrument {
	void play() {
		System.out.println("Violin 楷林");
	}
}

class Flute extends Instrument {
	void play() {
		System.out.println("Flute 楷林");
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
