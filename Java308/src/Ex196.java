import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Ex196 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\Kimdonghyun\\Desktop\\test.txt");
		
		byte[] bytes = Files.readAllBytes(path);
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		Stream<String> stream = lines.stream();
		stream.forEach(s -> System.out.println(s));
	}
}
