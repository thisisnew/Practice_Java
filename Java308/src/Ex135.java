import java.util.stream.Stream;

public class Ex135 {
	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("A","B","C");
		Stream<String> s2 = Stream.of("D","E");
		
		Stream<String> s3 = Stream.concat(s1, s2);
		
		s3.forEach(System.out::print);
	}
}
