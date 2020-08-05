import java.util.Calendar;
import java.util.Date;

public class Ex149 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();
		
		cal.add(Calendar.DATE, 45);
		
		Date date2 = cal.getTime();
		
		System.out.println(date);
		System.out.println(date2);
	}
}
