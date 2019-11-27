package com.amdocs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Main {

	public static void main(String[] args) {		
		LinkedList<Integer>  numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(1);
		numbers.add(5);
		numbers.add(20);
		numbers.add(10);
		numbers.add(25);
		numbers.add(20);

		printOccurrences( numbers );
	}

	private static void printOccurrences(LinkedList<Integer> numbers) {

		Map<Integer,Integer> occurencesMap 
			= new HashMap<Integer,Integer>();
		
		int occurences = 0;
		
		for ( int element : numbers ) {
			if ( occurencesMap.containsKey(element) ) {
				occurences = occurencesMap.get(element);
				++occurences;
				occurencesMap.put(element, occurences);
			}
			else
				occurencesMap.put(element, 1);
		}
		
		System.out.println("Prints the occurrences multiple times");
		for ( int element : numbers )
			System.out.println( "" + element + " appeared " 
						+ occurencesMap.get(element) + " times.");
		
		System.out.println("\nPrints the occurrences of each number only once");
		Iterator iter = occurencesMap.entrySet().iterator();
		
		while ( iter.hasNext() ) {
			Map.Entry<Integer,Integer> elem 
					= (Map.Entry<Integer,Integer>)iter.next();				
			
			System.out.println( "" + elem.getKey() + " appeared " 
						+ elem.getValue() + " times.");
		}
	}
	
}