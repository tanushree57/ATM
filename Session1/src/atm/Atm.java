package atm;
import java.util.*;

public class Atm {

	private int balance = 100;
	Scanner input = new Scanner(System.in);
	
	public int account() {
		System.out.println("Enter account number");
		int account;
		account = input.nextInt();
		return account;
}
	
	public int pin() {
		System.out.println("Enter your pin number: ");
		int pin;
		pin = input.nextInt();
		return pin;
	}
	
	public void atm() {
		int ch;
		System.out.println("ATM Machine");
		System.out.println("1. View balance");
		System.out.println("2. Withdraw cash");
		System.out.println("Input choice: ");
		ch = input.nextInt();
		
		switch(ch){
		case 1: viewbal();
		break;
		case 2: withdraw(20);
		break;
		default: System.out.println("Wrong input.");
		break;
		}
	}
	
	public void viewbal() {
		System.out.println("Your balance is: Rs. "+ balance);
	}
	
	public void withdraw(int amt) {
		if (balance - amt < 0)
			System.out.println("Insufficient funds");
		else {
			balance = balance - amt;
			viewbal();
		}
	}
	
	public void startAtm() {
		account();
		pin();
		atm();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount myaccount = new BankAccount(1234, 12, 100, 1000);
		
		Atm myAtm = new Atm();
		myAtm.startAtm();
		}
	}

