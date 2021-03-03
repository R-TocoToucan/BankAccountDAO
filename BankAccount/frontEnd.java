package BankAccount;

public class frontEnd {

	public static void main(String[] args) {
		
		UserAccountDAO studentDAO = new UserAccountDAO();

	
		/*
		do {
		
			UserAccount deep = new UserAccount();
			deep.setFirstName("deEp");
			deep.setLastName("Singh");
			deep.setSsn(1234567);
			deep.setPhoneNumber(646718273);
	
		}while(exit)
		 */			

		UserAccount deep = new UserAccount();
	
		
		studentDAO.createUser(deep);

		deep.deposit(1000);
		deep.printAccountInfo();

		

		
	}
}
