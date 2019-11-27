package org.tektutor;

import java.util.HashMap;
import java.util.Map;

//This is called Factory Method Design Pattern
public class CarFactory {
	
	public static ICar getCar ( int carIndex ) {
		
		Map<Integer, String> carIndexNameMap 
			= new HashMap<Integer, String>();
		
		carIndexNameMap.put(1, "AudiQ7");
		carIndexNameMap.put(2, "BMWX5");
		
		String className = "" + carIndexNameMap.get(carIndex);
		
		ICar car = null;
		
		if ( className.equals("AudiQ7") )
			car = new AudiQ7();
		else if ( className.equals("BMWX5") )
			car = new BMWX5();
		else
			car = new NullCar(); //Null Object Design Pattern
		
		return car;
		
	}

}