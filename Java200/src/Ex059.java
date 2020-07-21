import java.util.ArrayList;
import java.util.List;

public class Ex059 {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<Integer>();
		int s = 0;
		for(int i=0; i<=100; i++) {
			ilist.add(i);
		}
		
		s = ilist.stream().reduce(0, Integer::sum);
		System.out.println("1부터 100 합 : " + s);
		s = 0;
		
		s = ilist.stream().filter(i->i%2==1).reduce(0, Integer :: sum);
		System.out.println("1부터 100 홀수 합 : " + s);
		
		
		
		
	}
}
