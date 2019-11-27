package org.tektutor;

public class PriceCalculator1 implements IPriceCalculator {

	@Override
	public double getPrice() {
		System.out.println("Functionality is support from v1.0");
		System.out.println("Formula 1");
		return 100.00;
	}

}
