import java.io.File;

public class Ex178 {

	public static void main(String[] args) {
		File dir = new File("lib");
		
		String[] fileNames = dir.list();
		
		for(String fileName : fileNames) {
			
		}

		
		File[] files = dir.listFiles();
		
		for(File file : files) {
			
		}
	}

}
