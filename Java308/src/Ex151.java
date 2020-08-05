import java.util.Calendar;

public class Ex151 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int day1 = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(day1);
	}
}
