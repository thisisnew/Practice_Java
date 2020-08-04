import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex140 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "python", "react","javascript", "program");
		
		Map<Character, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(s -> s.charAt(0)));
		
		System.out.println(map.get("J"));
		System.out.println(map.get("p"));
	}
}
