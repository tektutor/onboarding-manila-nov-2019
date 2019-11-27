package org.tektutor;

public class DebitAccount implements Account {

//	@Override
//	public void setCredit(double amount) {
//		System.out.println("This method is not applicable for Debit Accounts");
//	}

	@Override
	public void deposit(double amount) {
		System.out.println("Deposit method is applicable for Debit Accounts");
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Withdraw method is also applicable for Debit Accounts");
	
	}

}
