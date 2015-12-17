package atm;

public class PrintReceipt {
	
	public void print(int accno, float bal) {
		
		System.out.println("\nATM Receipt");		
		System.out.println("Account Number " + accno);
		System.out.println("Current Balance in account: " + " Rs " + bal);

	}

}
