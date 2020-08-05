import java.util.Calendar;
import java.util.Date;

public class Ex150 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();
		
		cal.add(Calendar.MONTH, 1);
		
		Date date2 = cal.getTime();
		
		if(date.before(date2)) {
			System.out.println("date가 date2보다 이전입니다");
		}
	}
}
