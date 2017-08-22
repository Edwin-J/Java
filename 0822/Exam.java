import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> ");
		String str = sc.nextLine();
		StringBuffer STR = new StringBuffer(str);
		// 보기 문장 입력
		
		while (true) { // 무한 반복
			
			System.out.print("명령 : ");
			String cmd = sc.nextLine();
			
			if (cmd.equals("exit")) {
				System.out.println("종료합니다.");
				System.exit(0);
			} // 'exit' 입력 시 종료
			
			try {
				
				String strArray[] = cmd.split("!");
				String str1 = strArray[0];
				String str2 = strArray[1];
				// '!'를 기준으로 찾으려는 문자열과 바꾸려는 문자열 분류
					
				int index = STR.indexOf(str1); // 찾으려는 문자열 위치
				STR.replace(index, index + str1.length(), str2); // 바꾸려는 문자열로 바꿔줌
				System.out.println(STR);
				
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("잘못된 명령입니다!");
				// 오류 발생 시 출력
			}
			
		} 
		
	}

}
