
public class Zizon {
	boolean human;
	String gender;
	
	public Zizon(){ };
	public Zizon(boolean b, String n){
		human = b;
		gender = n;
	}
	
	
	public void goToilet(String name){
		System.out.println(name + "ȭ��ǰ���");
	};
	
	public void print(){
		System.out.println("�層���� ����սô�.");
	}
	
	public void print(String name){
		System.out.println(name + "�� �層���� �Ⱦ��մϴ�.");
	}
	
	public void print (int i, String name) {
		System.out.println(i + "��°�� " + name + "��(��) �����մϴ�.^&^");
	}
	
	public void print (String name, int i){
		System.out.println(name + "��(��) ��ȣ��" + i + "�Դϴ�.");
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isHuman() {
		return human;
	}

	public void setHuman(boolean human) {
		this.human = human;
	}
	
}
