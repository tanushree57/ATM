package atm;

public class ATMClient {

	public static void main(String[] args) {
		Card mycard = new Card(100, 1234);
		
		BankAccount myaccount = new BankAccount(1234, 12, 100, 1000);
		
		Atm myAtm = new Atm(myaccount);
		
		PrintReceipt printReceipt= new PrintReceipt();
		
		if (myAtm.insertCard(mycard, 1234) == true)
			System.out.println("Card Verified");
		else
			System.out.println("Card Rejected");;
		
		printReceipt.print(myaccount.getAccNo(), myaccount.getBalance());

		if (myAtm.withdraw(200) == true)
			System.out.println("Transaction Successful");
		else
			System.out.println("Transaction failed");

		System.out.println("Balance after withdrawal: Rs " + myAtm.checkBalance());
		
	}
}