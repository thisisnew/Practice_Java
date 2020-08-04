import java.util.stream.Stream;

public class Ex134 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("A","B","C");
		
		stream
			.filter(s -> s.equals("A"))
			.forEach(s -> System.out.println(s));
	}
}
