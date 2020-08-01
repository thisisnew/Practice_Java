import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map.Entry;

public class Ex077 {
	public static void main(String[] args) {
		EnumSet<Flag> flags = EnumSet.of(Flag.A, Flag.C);
		boolean test = flags.contains(Flag.C);
		
		System.out.println(test);
		
		
		EnumMap<Sex, Integer> map =  new EnumMap<>(Sex.class);
		
		map.put(Sex.MAN, 1);
		map.put(Sex.WOMAN, 2);
		
		for(Entry<Sex, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		for(Sex sex : map.keySet()) {
			System.out.println(sex);
		}
		
		for(int i : map.values()) {
			System.out.println(i);
		}
	}
	
	public enum Flag{
		A,B,C,D;
	}
	
	public enum Sex{
		MAN,WOMAN;
	}
}
