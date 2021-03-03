package BankAccount;

import java.util.ArrayList;

public class UserAccountDAO {
	
	
	ArrayList<UserAccount> javaClass = new ArrayList<UserAccount>();

	//Create Method  --> Insert statement
		public void createUser(UserAccount newUser) {
			javaClass.add(newUser);
		}
		
		
		public void deposit(UserAccount newUser, double amount) {
		    newUser.setBalance(newUser.getBalance() + amount);
		
		    System.out.println(newUser.getCustomerName() + " deposited $" + amount + ". Current Balance is $" + newUser.getBalance());
		    }
		
		
		public void withdraw(UserAccount newUser, double amount) {
			if (newUser.getBalance() >= amount) {
		        newUser.setBalance(newUser.getBalance() - amount);
		        System.out.println(newUser.getCustomerName() + " withdrew $" + amount + ". Current Balance is $" + newUser.getBalance());
		    }
		    if (newUser.getBalance() < amount) {
		        System.out.println("Cannot withdraw due to insufficient funds. Current Balance is $" + newUser.getBalance());
		    }
		}
		
		//Delete Method  --> Delete SQL statement
		public void printAccountInfo(UserAccount newUser) {
		    System.out.println("Customer's name: "+ newUser.getCustomerName() + "\nCurrent balance :" + newUser.getBalance() 
		    + "\nCustomer email : "  + newUser.getEmail() + "\nPhone number: " + newUser.getPhoneNo());
				
		}

	
}
