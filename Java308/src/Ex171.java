import java.io.File;

public class Ex171 {

	public static void main(String[] args) {
		File oldFile = new File("aaa.txt");
		File newFile = new File("bbb.txt");
		
		oldFile.renameTo(newFile);

	}

}
