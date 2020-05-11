public class Card implements Comparable<Card> {
	private char symbol;
	private int number;
	
	public Card() {}
	
	public Card(char symbol, int number) {
		super();
		this.symbol = symbol;
		this.number = number;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [symbol=" + symbol + ", number=" + number + "]";
	}

	@Override
	public int compareTo(Card o) {
		if (this.symbol < o.symbol) return -1;
		else if (this.symbol > o.symbol) return 1;
		else return 1;
	}
	
	@Override
	public int hashCode() {
        return String.valueOf(symbol).hashCode();
	}
	
	@Override
    	public boolean equals(Object obj){
        if (obj instanceof Card) {
        	Card card = (Card) obj;
            return (card.symbol == this.symbol);
        } else {
            return false;
        }
    }
}