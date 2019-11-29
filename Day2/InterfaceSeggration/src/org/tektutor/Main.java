package org.tektutor;

public class Main {

	public static void main(String[] args) {

		IMobile nokia3110 = new Nokia3210Mobile();
		nokia3110.printSpecifications();

		IMobile iPhone11Pro = new IPhone11Pro();
		iPhone11Pro.printSpecifications();
	
	}

}
