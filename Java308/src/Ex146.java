import java.util.Calendar;

public class Ex146 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, 1980);
		calendar.set(Calendar.HOUR_OF_DAY, 22);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		calendar.set(Calendar.MONTH, Calendar.JULY);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println(year);
		System.out.println(month);
		
	}
}
