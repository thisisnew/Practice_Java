import java.util.Arrays;
import java.util.List;

public class Ex042 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "8", "is", "great");
		
		String str = String.join(" ", list);
		
		System.out.println(str);
		
		String str2 = String.join("-", "010","####","####");
		
		System.out.println(str2);
	}
}
