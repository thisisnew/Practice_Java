import java.util.Arrays;
import java.util.List;

public class Ex137 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C","D","E");
		
		boolean res1 = list.stream().allMatch(s -> s.startsWith("A"));
		
		System.out.println(res1);
		
		boolean res2 = list.stream().anyMatch(s -> s.startsWith("A"));
		System.out.println(res2);
		
		boolean res3 = list.stream().noneMatch(s -> s.startsWith("A"));
		System.out.println(res3);
	}
}
