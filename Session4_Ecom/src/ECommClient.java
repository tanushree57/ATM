//Ecomm Payment

public class ECommClient {

	public static void main(String[] args) {
		Item item1= new Item();

		EComsite flipkart = new EComsite();
		
		flipkart.choosePaymentMethod("CreditCard");

		flipkart.makePayment(item1.getPrice());

	}

}
