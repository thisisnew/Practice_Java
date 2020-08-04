import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex136 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA","BB","CC","DD");
		
		list.stream()
			.map(s -> s.toLowerCase())
			.forEach(s -> System.out.println(s));
		
		
		List<String> list2 = Arrays.asList("Ja,va","Pyth,on","Rea,ct");
		
		list2.stream()
			.flatMap(s -> Stream.of(s.split(",")))
			.forEach(System.out::println);
					
	}
}
