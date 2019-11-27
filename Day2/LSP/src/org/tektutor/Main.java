package org.tektutor;

public class Main {

	public static void main(String[] args) {

		Account account = new DebitAccount();
		
		//This is not supposed to be allowed for Debit account
		
		//We are in a way saying we don't need polymorphism - workaround
		//if ( account instanceof CreditAccount)
		
	}

}
