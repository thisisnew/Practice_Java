import java.io.File;

public class Ex177 {
	public static void main(String[] args) {
		File file = new File("C:\\Users");
		
		String parentDirName = file.getParent();
		
		File parDir = file.getParentFile();
	}
}
