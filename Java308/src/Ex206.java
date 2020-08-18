import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex206 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * try (BufferedReader reader = new BufferedReader(new InputStreamReader( new
		 * FileInputStream("C:/Users/Kimdonghyun/Desktop/test.txt"),
		 * StandardCharsets.UTF_8))) {
		 * 
		 * String line = null;
		 * 
		 * while ((line = reader.readLine()) != null) { System.out.println(line); }
		 * 
		 * }
		 */
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("")); 
				ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			byte[] buf = new byte[1024 * 8];
			int length = 0;
					
			while( (length = in.read(buf)) != -1 ) {
				out.write(buf,  0, length);
			}
			
			byte[] bytes = out.toByteArray();
			
			String str = new String(bytes, "UTF-8");
		}
	}
}
