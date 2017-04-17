
public class Zizon {
	boolean human;
	String gender;
	
	public Zizon(){ };
	public Zizon(boolean b, String n){
		human = b;
		gender = n;
	}
	
	
	public void goToilet(String name){
		System.out.println(name + "화장실가기");
	};
	
	public void print(){
		System.out.println("장광준을 사랑합시다.");
	}
	
	public void print(String name){
		System.out.println(name + "가 장광준을 싫어합니다.");
	}
	
	public void print (int i, String name) {
		System.out.println(i + "번째로 " + name + "을(를) 좋아합니다.^&^");
	}
	
	public void print (String name, int i){
		System.out.println(name + "은(는) 번호가" + i + "입니다.");
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
