package atm;

public class Atm {
	
	//controller

	BankAccount myaccno;
	CardReader cardReader;
	int accNo;
		
	public Atm(BankAccount myaccount) {
		this.myaccno = myaccount;
		cardReader = new CardReader();
	}
	
	public boolean insertCard(Card card, int pin) {
		cardReader.setCard(card);
		if (cardReader.getCardNo() == myaccno.getCardNo()) {

			if (cardReader.checkPin(pin)) {
				accNo = myaccno.getAccNo();
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public float checkBalance() {
		if (accNo != 0)
			return myaccno.getBalance();
		else
			return 0;
	}

	public boolean withdraw(float amount) {
		if (accNo != 0) {
				return myaccno.withdraw(amount);
		}
		else
			return false;
	}
}