
public class Array {

	public static void main(String[] args) {
		int test[] = {9, 4, 3, 8, 2};
		int sum = 0;
		int odd = 0;
		int even = 0;
		
		for(int i = 4; i >= 0; i--){
			System.out.println(test[i]);
			
			sum += test[i];
			
			if(test[i] % 2 == 0)
				even++;
			
			else
				odd++;
		}
		
		System.out.println("���� = " + sum);
		System.out.println("¦���� ���� = " + even);
		System.out.println("Ȧ���� ���� = " + odd);
	}

}
