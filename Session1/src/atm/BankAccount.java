package atm;

public class BankAccount {
	
	int accno = 1234;
	int pin = 12;
	int cardno = 100;
	float bal = 1000;
	
	public BankAccount(int accno, int pin, int cardno, int bal){
		this.accno = accno;
		this.pin = pin;
		this.cardno = cardno;
		this.bal = bal;
	}

	public int getPin() {
		return pin;
	}
	
	public int getCardNo() {
		return cardno;
	}

	public int getAccNo() {
		return accno;
	}

	public float getBalance() {
		return bal;
	}

	public boolean withdraw(float amt) {
		if (bal > amt) {
			bal = bal - amt;
			return true;
		} else {
			return false;
		}
	}
}