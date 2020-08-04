import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex141 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Scala", "Javascript", "Groovy");
		
		List<String> res1 = list.stream()
							.map(s -> s.toUpperCase())
							.collect(Collectors.toList());
		//System.out.println(res1);
		
		Map<String, String> map = list.stream()
									.collect(Collectors.toMap(s -> s, s-> s.toUpperCase()));
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			//System.out.println(entry.getKey() + "," + entry.getValue());
		}
		
		Object[] result1 = list.stream().map(s -> s.toUpperCase()).toArray();
		//System.out.println(Arrays.toString(result1));
		
		String[] result2 = list.stream()
							.map(s -> s.toUpperCase())
							.toArray(String[]::new);
		System.out.println(Arrays.toString(result2));
				
	}
}
