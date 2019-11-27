package org.tektutor;

public class InvoiceGenerator {

	IPriceCalculator priceCalculator = null;
	
	//Closed for extension
//	public double getPrice() {
//		System.out.println("Software version 2.0");
//		System.out.println("Formula 2");
//		return 200.00;
//	}

	public InvoiceGenerator() {
		
	}
	
	//Dependency Injection
	//aka Dependency Inversion
	//aka Inversion of Control 
	public double getPrice(IPriceCalculator priceCalculator) {
		this.priceCalculator = priceCalculator;
		return priceCalculator.getPrice();
	}
	
}
