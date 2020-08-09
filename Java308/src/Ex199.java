import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex199 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("test.txt");
		
		InputStream in = Files.newInputStream(path);
		
		OutputStream out = Files.newOutputStream(path);
		
		ByteChannel channel = Files.newByteChannel(path);
	}
}
