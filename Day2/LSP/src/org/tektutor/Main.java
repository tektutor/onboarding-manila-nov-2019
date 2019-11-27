package org.tektutor;

public class Main {

	public static void main(String[] args) {

		Account account = new DebitAccount();
		
		//This is not supposed to be allowed for Debit account
		
		//We are in a way saying we don't need polymorphism - workaround
//		if ( account instanceof CreditAccount )
//			account.setCredit(5000);
//			
		//This approach is better as we can never use setCredit
		//on DebitAccount
		account.withdraw(2000);
		
		//While we can still use withdraw and setCredit on CreditAccount
		account = new CreditAccount();
		((CreditAccount) account).setCredit( 5000 );
	}

}
