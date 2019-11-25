package com.amdocs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String fileName = "numbers.txt";
		
		try {
			MyFile file = new MyFile();
			
			file.createFile(fileName);
			file.printFile (fileName);
						
			Scanner scanner  = new Scanner ( System.in );
			System.out.println("Type the number you are looking for in the file ?");
			int x = scanner.nextInt();
			
			if ( file.isNumberFound(fileName, x) ) {
				System.out.println("" + x + " is in the file.");
			}
			else {
				  System.out.println("" + x + " is not in the file.");
			}
			
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
		
	}

}
