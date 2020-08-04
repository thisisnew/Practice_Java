import java.util.Arrays;
import java.util.List;

public class Ex139 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("javascript","java", "python", "react");
		
		list.stream()
			.sorted()
			.forEach(s -> System.out.println(s));
		
		list.stream()
			.sorted((a,b) -> a.length() - b.length())
			.forEach(System.out::println);
	}
}
