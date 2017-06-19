
class PetOwner {
	public void see(Doctor d, Animal obj){
		System.out.println(d.heal(obj) + "를 치료함.");
	}
}

class Doctor {
	public String heal(Animal obj){
		if (obj instanceof Dog) return "개 1마리";
		else if (obj instanceof Cat) return "고양이 1마리";
		else return "동물 1마리";
	}
}

class Animal {	}
class Dog extends Animal {	}
class Cat extends Animal {	}

public class Instanceof_3 {

	public static void main(String[] args) {
		PetOwner o = new PetOwner();
		Doctor d = new Doctor();
		
		o.see ( d, new Dog() );
		o.see ( d, new Cat() );
	}

}
