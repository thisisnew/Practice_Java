import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex194 {	
	public static void main(String[] args) {
		Path parent = Paths.get("test.txt");
		
		try(Stream<Path> children = Files.list(parent)) {
			
			children.forEach(path -> {
				System.out.println(path.toAbsolutePath());
			});
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
