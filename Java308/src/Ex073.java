
public class Ex073 {
	public static void main(String[] args) {
		argTest("a");
		
		argTest("a","b","c");
	}
	
	public static void argTest(String ...arg) {
		for(String str : arg) {
			System.out.println(str);
		}
	}
}
