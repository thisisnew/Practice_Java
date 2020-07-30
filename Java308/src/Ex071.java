
public class Ex071 {
	public static void main(String[] args) {
		String str = Ex071.staticField;
		System.out.println(str);
		
		Ex071.staticMethod();
	}
	
	public static String staticField = "static 필드";
	
	public static void staticMethod() {
		System.out.println("static 메소드 호출");
	}
}
