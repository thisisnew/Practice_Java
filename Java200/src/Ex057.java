import java.util.Arrays;
import java.util.List;

public class Ex057 {
	
	public static void main(String[] args) {
		List<Integer> mmlist = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		mmlist.forEach(m -> {System.out.print(m + "\t");});
	
		System.out.println();
	}
}
