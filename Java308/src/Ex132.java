import java.util.Arrays;
import java.util.List;

public class Ex132 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","b","C","D","b");
		
		long cnt = list.stream().distinct().count();
		
		System.out.println(cnt);
	}
}
