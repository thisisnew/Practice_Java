import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex148 {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'/'MM'/'dd hh':'mm");
		
		try {
			Date date = sdf.parse("2015/07/23 12:05");
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
