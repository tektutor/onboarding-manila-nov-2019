package com.amdocs;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
	
	private int getRandomInteger(int min, int max ) {
		return (int) ( Math.random() * ((max-min) + 1) ) + min;
	}
	
	public void printFile(String fileName) throws IOException {	
		FileReader reader = new FileReader(fileName);
		
		int number = 0;
		//Check if we have reached the EOF - End Of File
		while ( ( number = reader.read() ) != -1) {
			System.out.println( number );
		}
		reader.close();	
	}
	
	public void createFile(String fileName) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		
		for ( int count=1; count < 101; ++count ) {
			writer.write( getRandomInteger(1,100) );
		}	
		writer.close();
	}
	
	public boolean isNumberFound ( String fileName, int number ) throws IOException {
		
		FileReader reader = new FileReader ( fileName );	
		int x = 0;
		
		while ( ( x = reader.read() ) != -1 ) {	
			if ( x == number )
				return true;
		}
		
		reader.close();
		return false;
		
	}
	
	
}