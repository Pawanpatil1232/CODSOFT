package application;

public class Client {
	public static void main(String [] args) {
	  BankAccount account = new BankAccount(1000); // initial balance
	  ATM atm = new ATM(account);
	  atm.run();
	}
}
