import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Ex173 {

	public static void main(String[] args) {
		File file = new File("aaaa.txt");
		
		long time = file.lastModified();
		
		Date date = new Date(time);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
	}

}
