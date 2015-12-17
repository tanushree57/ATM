package atm;

public class CardReader {
	
	Card card;
	

	
	public void setCard(Card card) {
		this.card = card;
	}

	public boolean checkPin(int pin) {
		if (card.getPin() == pin)
			return true;
		else
			return false;
	}

	public int getCardNo() {
		return card.getCardNo();
	}
	

}
