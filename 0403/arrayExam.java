
public class arrayExam {

	public static void main(String[] args) {
		/*int gwangjunJang[][] = new int[2][3];
		gwangjunJang[0][0] = 1;
		gwangjunJang[0][1] = 2;
		gwangjunJang[0][2] = 3;
		gwangjunJang[1][0] = 4;
		gwangjunJang[1][1] = 5;
		gwangjunJang[1][2] = 6;*/
		
		/*int gwangjunJang[][] = new int[][] {{1, 2, 3}, {4, 5, 6}};*/
		
		/*int gwangjunJang[][] = {{1, 2, 3}, {4, 5, 6}};*/
		
		int gwangjunJang[][] = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
		
		/*int gwangjunJang[][] = new int[2][];
		gwangjunJang[0] = new int [3];
		gwangjunJang[1] = new int [10];
		for(int i = 0; i < gwangjunJang.length; i++){
			for(int j = 0; j < gwangjunJang.length; i++){
				System.out.printf("%d\t", gwangjunJang[i][j]);
			}
			System.out.println(
					);
		}*/
		
		for(int i = 0; i < gwangjunJang.length; i++){
			for(int j = 0; j < gwangjunJang[i].length; j++){
				System.out.printf("%d\t", gwangjunJang[i][j]);
			}
		}
	}

}
