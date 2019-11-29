package org.tektutor;

public class IPhone11Pro implements IMobile, I3G, I4G, IBluetooth, ICamera, IWifi{

	@Override
	public void wifiFunctionlaity() {
		System.out.println("WIFI");
	}

	@Override
	public void cameraFunctionality() {
		System.out.println("Front & Rear Cameras");		
	}

	@Override
	public void FourGFunctionality() {
		System.out.println("4G");				
	}

	@Override
	public void ThreeGFunctionality() {
		System.out.println("3G");				
	}

	@Override
	public void smsFunctionality() {
		System.out.println("SMS");				
	}

	@Override
	public void basicCallFunctionality() {
		System.out.println("Basic voice calling functionalities");
	}

	@Override
	public void TwoGFunctionality() {
		System.out.println("2G");	
	}
	
	@Override
	public void blueToothFunctionlaity() {
		System.out.println("Bluetooth");
	}

	@Override
	public void printSpecifications() {
		System.out.println("IPhone 11Pro Secifications");
		System.out.println("----------------------------");
		basicCallFunctionality();
		TwoGFunctionality();
		ThreeGFunctionality();
		FourGFunctionality();
		smsFunctionality();
		cameraFunctionality();
		wifiFunctionlaity();
		
		
	}

}
