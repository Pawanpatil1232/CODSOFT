package application;

import java.util.Scanner;

class ATM {
      private BankAccount userAccount;
      
      public ATM(BankAccount account)
      {
    	  userAccount= account;
      }
      public void displayMenu() 
      {
    	  System.out.println("Welcome to the ATM");
    	  System.out.println("1. Check Balance");
    	  System.out.println("2. Deposit");
    	  System.out.println("3. Withdraw");
    	  System.out.println("4. Exit");
      }
      
      @SuppressWarnings("resource")
	public void run() 
      {
    	  Scanner scanner = new Scanner(System.in);
    	  int choice;
    	  
    	do { 
    		  displayMenu();
    		  System.out.println("Enter your choice :");
    		  choice = scanner.nextInt();
    		
    		switch(choice) {
    	  case 1: 
    		  System.out.println("Your Balance: $" +userAccount.getBalance() );
    		  break;
    	  case 2:
    		  System.out.println("Enter Deposit amount: $");
    		  double depositAmount = scanner.nextDouble();
    		  userAccount.deposit(depositAmount);
    		  break;
    	  case 3:
    		  System.out.println("Enter withrawal amount: $");
    		  double withdrawalAmount = scanner.nextDouble();
			  userAccount.withdraw(withdrawalAmount);
    		  break;
    	  case 4:
    		  System.out.println("Thank you for using the ATM");
    		  break;
    	  default: 
    		  System.out.println("Invalid choice, Please try Again.");
    	  }
    	} while(choice !=4);	
      }
      
}
