//Ecomm Payment

public class DebitCard implements PaymentMethod{

		@Override
		public void makepayment(int price) {
			System.out.println("Paid Rs. " + price + " using Debit Card");
			
		}

	}
