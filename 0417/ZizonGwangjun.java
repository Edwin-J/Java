
public class ZizonGwangjun {

	public static void main(String[] args) {
		Zizon z = new Zizon(false, "�層��");
		
		z.human = false;
		z.gender = "����";
		
		z.goToilet("������");
		
		System.out.println("�����̴� " + z.gender + "�̰�, " +
				"������ ������δ� " + z.human + "�Դϴ�.");
		
		z.print();
		z.print("���Ѽ�");

		z.print(2, "������");
		z.print("�層��", 22);
	}

}
