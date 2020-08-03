import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex106 {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		
		list.add("AA");
		list.add("BB");
		
		
		
		list.removeIf(s -> s.equals("AA"));
		
		System.out.println(list);
		
		}
}
