package org.tektutor;

public class Main {

	public static void main(String[] args) {

//		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();	
//		
//		System.out.println( invoiceGenerator.getPrice(new PriceCalculator1()) );
//		System.out.println( invoiceGenerator.getPrice(new PriceCalculator2()) );
//		System.out.println( invoiceGenerator.getPrice(new PriceCalculator3()) );

		ReportGenerator reportGenerator = new ReportGenerator();
		reportGenerator.createReport( new XMLReportGenerator(), "MyReport.xml");
		reportGenerator.createReport( new DocReportGenerator(), "MyReport.doc");
		reportGenerator.createReport( new PDFReportGenerator(), "MyReport.pdf");


	
	}

}
