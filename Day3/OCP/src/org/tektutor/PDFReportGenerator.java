package org.tektutor;

public class PDFReportGenerator implements IReportGenerator {	
	//Open Closed Principle (OCP)
	//	1. Your code/design should be open for adding new functionality
	//	2. Your code/design should not require modifying existing code
	//	   to add new functionality
		   
	public void createReport(String filename) {		
			System.out.println("Generated " + filename + " report");
	}
	
}