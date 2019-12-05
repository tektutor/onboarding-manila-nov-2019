package org.tektutor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {

		FileInputStream file 
			= new FileInputStream("src/main/resources/config.properties");
		
		Properties properties = new Properties();
		properties.load(file);
		
		System.out.println(properties.getProperty("+"));
		System.out.println(properties.getProperty("-"));
		System.out.println(properties.getProperty("*"));
		System.out.println(properties.getProperty("/"));

	}

}
