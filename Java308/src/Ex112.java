import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex112 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c");
		
		String[] array = list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(array));
		
		List<String> list2 = Arrays.asList(array);
		
		System.out.println(list2);
		
	}
}
