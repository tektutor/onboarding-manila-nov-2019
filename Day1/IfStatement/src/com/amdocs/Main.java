package com.amdocs;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your first number : ");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter your second number : ");
		int secondNumber = input.nextInt();
		
		//In case, you need to find the greatest of these two numbers
		if ( firstNumber > secondNumber ) {
			System.out.println("" + firstNumber + " is greater.");
		}
		else {
			System.out.println("" + secondNumber + " is greater.");
		}
		
		//The logic above without if condition can be achieved by	
		//using Ternary operator
		int greater = (firstNumber > secondNumber) ? firstNumber : secondNumber;
		System.out.println("" + greater + " is greater.");
	
	}

}
