import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex138 {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(1,2,3,4,5);
		int tot = stream.sum();
		System.out.println(tot);
		
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
		Optional<Integer> result = stream2.reduce((a,b) -> a*b);
		System.out.println(result.orElse(-1));
		
		
		Stream<Integer> stream3 = Stream.of(1,2,3,4,5);
		Integer res = stream3.reduce(1, (a,b) -> a*b);
		System.out.println(res);
	}
}
