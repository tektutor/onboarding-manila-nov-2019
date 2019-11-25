package com.amdocs;

public class Main {

	public static void printUsingWhileLoop(int from, int to) {
		
		int index = from;
		
		while ( index < (to + 1) ) {
			System.out.println(index++);
		}
		
	}
	
	public static void printUsingForLoop(int from, int to) {

		for ( int index=from; index < (to+1); ++index ) {
			System.out.print(index + " ");
		}
		
	}
	
	public static void main(String[] args) {

		//printUsingWhileLoop(1,100);
		printUsingForLoop(1,100);
		
	}

}
