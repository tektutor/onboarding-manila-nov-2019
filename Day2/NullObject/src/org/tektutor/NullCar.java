package org.tektutor;

public class NullCar implements ICar {

	@Override
	public void drive() throws UnsupportedCarException {
		System.out.println("###Unsupported Car type chosen");
		throw new UnsupportedCarException();
	}

}