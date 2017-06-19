
class PetOwner {
	public void see(Doctor d, Animal obj){
		System.out.println(d.heal(obj) + "�� ġ����.");
	}
}

class Doctor {
	public String heal(Animal obj){
		if (obj instanceof Dog) return "�� 1����";
		else if (obj instanceof Cat) return "����� 1����";
		else return "���� 1����";
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
