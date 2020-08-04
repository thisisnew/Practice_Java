import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex143 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "React", "Javascript", "Python");
		
		list.parallelStream()
			.map(s -> s.toUpperCase())
			.forEach(System.out::println);
		
		IntStream.range(1, 100)
				.parallel()
				.filter(i -> i%2 == 0)
				.forEach(System.out::println);
				
	}
}
