package org.tektutor;

public class ReportGenerator {

	//OCP Compliant method
	//This method doesn't require any change to support new report format
	public void createReport ( IReportGenerator reportGenerator, String fileName ) {
		reportGenerator.createReport(fileName);
	}
}
