import java.io.File;

public class Ex174 {
	File file = new File("text.txt");
	
	boolean canRead = file.canRead();
	
	boolean canWrite = file.canWrite();
	
	boolean canExe = file.canExecute();
	
	boolean isHidden = file.isHidden();
}
