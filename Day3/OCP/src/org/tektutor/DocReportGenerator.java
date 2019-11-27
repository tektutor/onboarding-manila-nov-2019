package org.tektutor;

public class DocReportGenerator implements IReportGenerator {

	@Override
	public void createReport(String filename) {
		System.out.println("Generated " + filename + " report");
	}

}
