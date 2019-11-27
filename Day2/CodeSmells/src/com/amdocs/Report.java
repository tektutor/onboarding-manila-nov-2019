package com.amdocs;

import java.awt.Robot;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

public class Report {
	    public static void report(Writer out, List machines, Robot robot)
	            throws IOException
	    {
	        printReportHeader(out);
	        printMachineDetails(out, machines);
	        printRobotDetails(out, robot);
	        printReportFooter(out);
	    }

		private static void printRobotDetails(Writer out, Robot robot) throws IOException {
			out.write("Robot");
	        if (robot.location() != null)
	              out.write(" location=" + robot.location().name());

	        if (robot.bin() != null)
	            out.write(" bin=" + robot.bin());
		}

		private static void printMachineDetails(Writer out, List machines) throws IOException {
			Iterator line = machines.iterator();
	        while (line.hasNext()) {
	            Machine machine = (Machine) line.next();
	            out.write("Machine " + machine.name());

	            if (machine.bin() != null)
	                out.write(" bin=" + machine.bin());
	            out.write("\n");
	        }
	        out.write("\n");
		}

		private static void printReportFooter(Writer out) throws IOException {
			out.write("\n");

	        out.write("========\n");
		}

		private static void printReportHeader(Writer out) throws IOException {
			out.write("FACTORY REPORT\n");
		}
}
