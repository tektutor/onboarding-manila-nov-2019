package org.tektutor.soapclient;

import org.tektutor.*;

public class Main {

	public static void main(String[] args) {

		CalculatorService calcualtorService = new CalculatorService();
		
		Calculator calculator = calcualtorService.getCalculator();
		
		System.out.println( calculator.add(100.0, 209.0));
	}

}
