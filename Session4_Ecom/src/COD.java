//Ecomm Payment

public class COD implements PaymentMethod {

	@Override
	public void makepayment(int price) {
		System.out.println("Paid Rs. " + price + " using COD");
		
	}

}
