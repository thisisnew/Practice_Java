import java.util.Calendar;

public class Ex152 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(day){
			case Calendar.MONDAY : System.out.println(Calendar.MONDAY); break;
			case Calendar.TUESDAY : System.out.println(Calendar.TUESDAY);  break;
			case Calendar.WEDNESDAY :System.out.println("오늘::" + Calendar.WEDNESDAY);  break;
			case Calendar.THURSDAY : System.out.println(Calendar.THURSDAY); break;
			case Calendar.FRIDAY : System.out.println(Calendar.FRIDAY); break;
			case Calendar.SATURDAY : System.out.println(Calendar.SATURDAY); break;
			case Calendar.SUNDAY : System.out.println(Calendar.SUNDAY); break;
		}
		
	}
}
