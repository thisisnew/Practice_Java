import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex130 {
	public static void main(String[] args) {
		IntStream intStream = IntStream.of(1,2,3,4);
		
		int[] Arr = {1,2,3,4,5};
		IntStream.of(Arr);
		
		
		Stream<String> stream = Stream.of("A","B","C");
		
		IntStream is = stream.mapToInt(s -> s.length());
		
		is.forEach(s -> System.out.println(s));
		
	}
}
