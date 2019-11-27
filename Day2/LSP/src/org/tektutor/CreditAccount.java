package org.tektutor;

public class CreditAccount implements Account {


	public void setCredit(double amount) {
		System.out.println("This method is applicable for Credit Accounts");
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Deposit method is applicable for Credit Accounts");
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Withdraw method is also applicable for Credit Accounts");
	
	}

}
