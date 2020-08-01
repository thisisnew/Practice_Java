package Ex076;

public class Main {
	public static void main(String[] args) {
		Color color = Sex.MAN;
		String str1 = color.getColor();
		System.out.println(str1);
		
		Color color2 = Sex.WOMAN;
		String str2 = color2.getColor();
		System.out.println(str2);
	}
}
