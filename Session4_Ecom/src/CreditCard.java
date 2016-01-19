//Ecomm Payment

public class CreditCard implements PaymentMethod{

	@Override
	public void makepayment(int price) {
		System.out.println("Paid Rs. " + price + " using Credit Card");
	}

}
