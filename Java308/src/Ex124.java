import java.util.HashMap;
import java.util.Map;

public class Ex124 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("A","a");
		map.put("B","b");
		map.put("C","c");
		
		for(Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		map.forEach((key, value) -> System.out.println(key+"," + value));
	}
}
