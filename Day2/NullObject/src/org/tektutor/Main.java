package org.tektutor;

import java.util.Scanner;

public class Main {

	private static void displayMenu() {
		System.out.println("++++++++++++");		
		System.out.println("    Menu");
		System.out.println("++++++++++++");
		System.out.println("Audi Q7 ---> 1");
		System.out.println("BMW X5 ----> 2");
		System.out.println("Audi Q8 ---> 3");

		System.out.println("Exit ------> 4");
		System.out.println("++++++++++++");
	}
	
	private static int getChoice() {
		System.out.println("Choose your car? ");
		Scanner scanner = new Scanner ( System.in );
		int choice = scanner.nextInt();
		
		if ( choice == 4 ) {
			System.out.println("Thank you for using our rental cars !");
			System.exit(0);
		}
		
		return choice;
	}
	
	public static void main(String[] args) throws UnsupportedCarException {
		
		while ( true ) {
			displayMenu();
			int choice = getChoice();
			
			ICar car = CarFactory.getCar(choice);
			
			//Is this a solution or workaround?
			//if ( car != null ) //This is a workaround - code smell
			car.drive();
		}
		
	}

}
