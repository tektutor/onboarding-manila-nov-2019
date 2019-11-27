package com.amdocs;

import java.util.LinkedList;

public class Main {
	
	
	public static void main(String[] args) {

		LinkedList<Integer> listOfNumbers = new LinkedList<Integer>();
		
		listOfNumbers.add(10);
		listOfNumbers.add(5);
		listOfNumbers.add(20);
		listOfNumbers.add(15);
		
		System.out.println("Before sorting ...");
		for ( int element : listOfNumbers ) {
			System.out.print( element + "->" );
		}
		System.out.println("X");
		
		listOfNumbers.sort(null);
		
		System.out.println("After sorting ...");
		for ( int element : listOfNumbers ) {
			System.out.print( element + "->" );
		}
		System.out.println("X");
		
		//In case you need to insert a new element at the beginning of the list
		listOfNumbers.addFirst(1);
		System.out.println("List after insert a value at the head");
		for ( int element : listOfNumbers ) {
			System.out.print( element + "->" );
		}
		System.out.println("X");

		//In case you need to append a value at the end
		listOfNumbers.addLast(1000);
		System.out.println("List after appending a value at the tail");
		for ( int element : listOfNumbers ) {
			System.out.print( element + "->" );
		}
		System.out.println("X");
	
	}
}
