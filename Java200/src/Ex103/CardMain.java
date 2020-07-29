package Ex103;

public class CardMain {
	public static void main(String[] args) {
		String csuit1 = "H";
		String csuit2 = "H";
		String cValue1 = "6";
		String cValue2 = "3";
		
		Card card1 = new Card("H6");
		Card card2 = new Card(csuit1+cValue1);
		Card card3 = new Card();
		Card card4 = new Card(csuit2+cValue2);
		
		System.out.printf("%s,%s,%s,%s",card1,card2,card3,card4);
		System.out.println(card1.getCardVal());
		System.out.println(card1.equals(card2));
	}
}
