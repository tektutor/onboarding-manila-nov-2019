package org.tektutor;

public class Mobile {

	private ICamera camera = null;
	
	//Dependency Injection or
	//Dependency Inversion or
	//Inversion of Control (IOC)
	public Mobile( ICamera camera ) {
		this.camera = camera;
	}

	public boolean powerOn() {
		
		System.out.println("Mobile powerOn method");
		if ( camera.on() ) {
			System.out.println("Camera turned on successfuly");
			return true;
		}
		else {
			System.out.println("Camera communication failed");
		}
		
		return false;	
	}
}
