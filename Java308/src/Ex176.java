import java.io.File;

public class Ex176 {
	public static void main(String[] args) {
		File file = new File("lib");
		
		String abPath = file.getAbsolutePath();
		
		File file2 = new File("lib");
		
		File abFile = file2.getAbsoluteFile(); 
	}
}
