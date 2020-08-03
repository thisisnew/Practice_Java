import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex121 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("A", "VB");
		map.put("B", "Javascript");
		
		String replace = (String) map.replace("A", "java");
		
		System.out.println(replace);
		System.out.println(map);
		
		map.replaceAll((key, value) -> ((String) value).toUpperCase());
		System.out.println(map);
		
		
	}
}
