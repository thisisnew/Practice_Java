import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex167 {

	public static void main(String[] args) throws IOException {
		FileSystem fs = FileSystems.getDefault();
		
		Path path = fs.getPath("C:\\Users\\Kimdonghyun\\Documents\\work");
		
		Files.createDirectory(path);
		
		Path file = path.resolve("text.txt");
		Files.createFile(file);

	}

}
