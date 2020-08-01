
public class Ex075 {
	public static void main(String[] args) {
		//compare(Sex.MAN);
		
		Sex man = Sex.valueOf("MAN");
		
		for(Sex sex : Sex.values()) {
			System.out.println("name()--" + sex.name() );
			System.out.println("toString()--" + sex.toString());
			System.out.println("ordinal()--" + sex.ordinal());
			System.out.println("compareTo()--" + sex.compareTo(Sex.WOMAN));
		}
		
		Sex2 woman = Sex2.WOMAN;
		
		int code = woman.getCode();
	}

	public static void compare(Sex sex) {
		switch (sex) {
		case MAN:
			System.out.println("남자입니다");
			break;
		case WOMAN:
			System.out.println("여자입니다");
			break;
		default:
			break;
		}
	}

	public enum Sex {
		MAN, WOMAN;
	}
	
	public enum Sex2{
		MAN(1), WOMAN(2);
		
		private final int code;
		
		private Sex2(int code) {
			this.code = code;
		}
		
		public int getCode() {
			return code;
		}
	}
}
