import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex145 {
	public static void main(String[] args) {
		Date date1 = new Date();
		
		Calendar calendar  = Calendar.getInstance();
		Date date2 = calendar.getTime();
		
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar calendar3 = Calendar.getInstance(timezone);
	}
}
