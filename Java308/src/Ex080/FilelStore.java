package Ex080;

import java.io.FileOutputStream;
import java.io.Serializable;

public class FilelStore <T extends FileOutputStream>{
	
	public <E extends Serializable & Comparable<E>> int compare(E data1, E data2) {
		return data1.compareTo(data2);
	}
	
}
