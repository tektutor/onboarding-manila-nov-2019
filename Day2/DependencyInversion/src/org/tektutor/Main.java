package org.tektutor;

public class Main {

	public static void main(String[] args) {

		Mobile mobile = new Mobile(new DummyCamera());
		
		boolean actualStatus = mobile.powerOn();
		boolean expectedStatus = true;
		
		if ( expectedStatus == actualStatus )
			System.out.println("Mobile powerOn functionality works fine");
		else
			System.out.println("Mobile powerOn has a bug");
		
	}

}
