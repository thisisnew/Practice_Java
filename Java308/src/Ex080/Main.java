package Ex080;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		FilelStore<FileOutputStream> file = new FilelStore<FileOutputStream>();
		
		
		int a = 1;
		int b = 2;
		
		System.out.println(file.compare(a, b));
		
		
	}
}
