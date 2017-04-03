
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
		
		System.out.println("識м = " + sum);
		System.out.println("礎熱曖 偃熱 = " + even);
		System.out.println("�汝鶺� 偃熱 = " + odd);
	}

}
