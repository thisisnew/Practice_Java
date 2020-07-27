import java.util.ArrayList;
import java.util.List;

public class Ex80 {
	public static void main(String[] args) {
		int intNm1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		Integer intWrap1 = intNm1;
		Long longWrap1 = longNum1;
		Double doubleWrap1 = doubleNum;
		double dd = doubleWrap1;
		
		Integer intWrap2 = intNm1;
		intNm1 = intWrap2;
		System.out.println(intNm1);
		
		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(new Integer(3));
		ilist.add(5);
		
		int a = ilist.get(0);
		System.out.println(a);
		
		int b = Integer.parseInt("123");
		System.out.println(b);
		
	}
}
