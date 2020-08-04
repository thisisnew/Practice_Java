import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex131 {
	public static void main(String[] args) {
		List<String> list  = Arrays.asList("A","B","C");
		
		Stream<String> str = list.stream();
		
		long cnt = str.count();
		
		System.out.println(cnt);
	}
}
