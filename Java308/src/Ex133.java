import java.util.Arrays;
import java.util.List;

public class Ex133 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C");
		
		list.stream().forEach(s -> System.out.print(s));
		
		list.stream().forEach(System.out::println);
	}
}
