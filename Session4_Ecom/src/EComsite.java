//Ecomm Payment

public class EComsite {
	
PaymentMethod pm;
	
	public boolean choosePaymentMethod(String ch) {
	if (ch=="CreditCard") {
			pm = new CreditCard();
	}
	else if (ch == "COD") {
		pm = new COD();
	}
	else if (ch == "DebitCard") {
		pm = new DebitCard();
	}
	else
		return false;
	return true;
}
	
	public void makePayment(int price) {
		pm.makepayment(price);
	}
}