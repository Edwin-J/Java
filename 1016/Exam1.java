import java.util.Calendar;

public class Exam1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d-%d-%d\n", year, month, date);
		
//		System.out.println(Calendar.JANUARY);
//		System.out.println(Calendar.FEBRUARY);
		
		Calendar clone = (Calendar) cal.clone();
		clone.set(2017, 11, 31);
		
		int year1 = clone.get(Calendar.YEAR);
		int month1 = clone.get(Calendar.MONTH) + 1;
		int date1 = clone.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("cal °´Ã¼ : %d-%d-%d\n", year, month, date);
		System.out.printf("Clone : %d-%d-%d\n", year1, month1, date1);
		
		
		
	}

}
