package Ex104;

public class Card {
	private String cardVal;
	public String getCardVal() {
		return cardVal;
	}
	
	public Card() {
		int suit = (int) (Math.random() * CardUtil.SUIT.length);
		
		int value = (int) (Math.random() * CardUtil.VALUE.length);
		
		cardVal = CardUtil.SUIT[suit] + CardUtil.VALUE[value];
	}
	
	public Card(String s) {
		this.cardVal = s;
	}
	
	public Card(Card c) {
		this(c.getCardVal());
	}

	@Override
	public String toString() {
		return "Card [cardVal=" + cardVal + "]";
	}
	
}