import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex041 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ccc","aaaaa","b");
		
		list.sort((s1, s2) -> s1.length() - s2.length());
		
		list.forEach(s -> System.out.println(s));
		
		list.forEach(System.out :: println);
	}
	
	

}
