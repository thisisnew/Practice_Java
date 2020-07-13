package EX038;

public class BioSwitch {
	public static void main(String[] args) {
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println("신체 지수 주기값:" + index.getPei());
		
		String st = textInfor(index, value);
		
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
		
	}
	
	public static String textInfor(PEI index, double value) {
		String result = null;
		
		switch ( index ) {
		case PHYSICAL:
			result = "신체 지수";
			break;
			
		case EMOTIONAL:
			result = "감정 지수";
			break;
			
		case INTELLECTUAL:
			result = "지성 지수";
			break;
			
		default: result = "미결정";
			break;
		}
		
		return result;
	}
	
}
