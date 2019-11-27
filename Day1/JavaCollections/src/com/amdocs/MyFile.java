package com.amdocs;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFile {

	private List<Integer> numbers;
	
	public MyFile() {
		numbers = new ArrayList<Integer>();
	}
	
	private int getRandomInteger(int min, int max ) {
		return (int) ( Math.random() * ((max-min) + 1) ) + min;
	}

	public void createFile( String fileName ) throws Exception {
		FileWriter fileWriter = new FileWriter ( fileName );
		
		int randomNumber = 0;	
		for ( int count=1; count<6; ++count) {
			randomNumber = getRandomInteger ( 1, 500 );	
			numbers.add(randomNumber);
		}

		//Sort the list before writing to file
		numbers.sort(null);
		
		//We need to only write the unique to the file
		
		for ( Integer n : numbers ) {
			fileWriter.write(n);
		}
		fileWriter.close();
	}
	
	public void printFile ( String fileName ) throws Exception {
		FileReader fileReader = new FileReader ( fileName );
		
		int x = 0;
		while ( (x = fileReader.read()) != -1 ) {
			System.out.println( x );
		}	
		
		fileReader.close();
	}
	
	public boolean isNumberFound ( String fileName,  int number ) throws Exception {
		FileReader fileReader = new FileReader ( fileName );
		List<Integer> tempList = new  ArrayList<Integer>();
		
		int x = 0;
		while ( (x = fileReader.read()) != -1 ) {
			tempList.add( x );
		}
		
		fileReader.close();
	
		return tempList.contains(number);
	}
}
