import java.util.Arrays;
import java.util.List;

public class Ex037 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Scala", "Groovy");
		
		list.sort((String s1, String s2) -> s1.length() - s2.length() );
		
		list.forEach(s -> System.out.println(s));
	}
}
