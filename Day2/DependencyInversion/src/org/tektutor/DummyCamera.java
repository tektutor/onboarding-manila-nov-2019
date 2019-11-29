package org.tektutor;

public class DummyCamera implements ICamera {

	@Override
	public boolean on() {
		System.out.println("Dummy camera on method");
		return true;
	}

}
