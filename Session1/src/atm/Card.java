package atm;

public class Card {
	
	int cardno;
	int pin;
	
	public Card(int cardno, int pin) {
		this.cardno = cardno;
		this.pin = pin;
	}
	
	public int getPin() {
		return pin;
	}

	public int getCardNo() {
		return cardno;
	}


}
