package com.amdocs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		String fileName = "numbers.txt";
		
		MyFile file = new MyFile();
		
		System.out.println("Creating files with random sorted numbers ...");
		file.createFile(fileName);
		
		System.out.println("Printing the file with random sorted numbers ...");
		file.printFile(fileName);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which number you are looking for in the file? ");
		int number = scanner.nextInt();
		
		System.out.println(file.isNumberFound(fileName, number));
		
	}

}
