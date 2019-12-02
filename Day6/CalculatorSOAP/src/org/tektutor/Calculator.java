package org.tektutor;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {

	@WebMethod
	public double add ( double x, double y ) {
		return x + y;
	}
}