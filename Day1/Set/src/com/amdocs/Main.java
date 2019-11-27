package com.amdocs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	private static List<Integer> numbers;
	private static Set<Integer> uniqueNumbers;
	
	public static void main(String[] args) {	
		numbers = new ArrayList<Integer>();
		uniqueNumbers = new HashSet<Integer>();
		
		numbers.add( 100 );
		numbers.add( 200 );
		numbers.add( 100 );
		numbers.add( 50  );
		numbers.add( 100 );
		
		System.out.println("Print all numbers in list ...");
		for ( int element : numbers )
			System.out.print(element + " ");
		
		for ( int element : numbers )
			uniqueNumbers.add(element);
		
		System.out.println("\n\nPrint unique numbers ...");	
		for ( int element : uniqueNumbers ) 
			System.out.print(element + " ");
	}
	
}