package org.tektutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//Factory Method - Creational Design Pattern
//The Factory method design patterns helps create a group of similar objects
public class MathFactory {
	private static Map<String,String> mathOperatorToClassNameMap;
	private static FileInputStream file;

	static {
		mathOperatorToClassNameMap = new HashMap<String,String>();
		String className;
		try {
			file 
			  = new FileInputStream ( "src/main/resources/config.properties");
		
			Properties properties = new Properties();
			properties.load(file);
			
			Set<String> mathOperators = properties.stringPropertyNames();
			
			for ( String mathOperator : mathOperators ) {
				className = properties.getProperty(mathOperator);
				mathOperatorToClassNameMap.put( mathOperator, className );
			}
		} catch (Exception e) {
			System.err.println("Error# - config file is missing.");
			System.exit(1);
		}
	}
	
	public static IMathOperation getObject( String mathOperator ) {
		
		IMathOperation mathOperation = null;	
		
		String className = mathOperatorToClassNameMap.get( mathOperator );
		
		try {
			mathOperation 
				= (IMathOperation) Class.forName(className).newInstance();
		}
		catch ( Exception e ) {
			System.err.println( e.toString() );
		}
		return mathOperation;
		
	}
	
}
