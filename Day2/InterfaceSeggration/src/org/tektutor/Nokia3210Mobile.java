package org.tektutor;

public class Nokia3210Mobile implements IMobile {

	@Override
	public void smsFunctionality() {
		System.out.println("Nokia 3210 supports SMS");
	}

	@Override
	public void basicCallFunctionality() {
		System.out.println("Nokia 3210 supports basic voice calling facilities");		
	}

	@Override
	public void TwoGFunctionality() {
		System.out.println("Nokia 3210 supports basic voice calling facilities");				
	}

	@Override
	public void printSpecifications() {
		System.out.println("Nokia 3210 Secifications");
		System.out.println("----------------------------");
		
		basicCallFunctionality();
		TwoGFunctionality();
		smsFunctionality();
	}

}
