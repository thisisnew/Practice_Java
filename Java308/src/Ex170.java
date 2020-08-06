import java.io.File;

public class Ex170 {
	public static void main(String[] args) {
		
	}
	
	private static void deleteDirectory(File dir) {
		
		for(File file : dir.listFiles()) {
			if(file.isDirectory()) {
				deleteDirectory(file);
			} else {
				file.delete();
			}
		}
		dir.delete();
	}
}
