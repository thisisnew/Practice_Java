package Ex031;

public class FruitMain {
	public static void main(String[] args) {
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());
		System.out.println(pear2.ordinal());
		
		
		FRUIT[] fruit = FRUIT.values();
		
		for(int i=0; i<fruit.length; i++)
			System.out.println(fruit[i]);
	}
	
}
