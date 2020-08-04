import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Ex129 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C","D");
		
		Stream<String> s1 = list.stream();
		
		s1
		.filter(s->s.startsWith("A"))
		.map(s->s.toLowerCase())
		.sorted((a,b) -> a.length() - b.length())
		.forEach(s-> System.out.println(s));
		
		Set<String> set = new HashSet<String>();
		set.stream();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.entrySet().stream();
		
		String[] arr = new String[] {"A","B"};
		
		Stream<String> stream1 = Stream.of(arr);
		
		stream1.forEach(System.out::print);
 	}
}
