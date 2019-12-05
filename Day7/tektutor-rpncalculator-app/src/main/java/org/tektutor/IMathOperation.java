package org.tektutor;

public interface IMathOperation {
	
	public double compute ( double firstNumber, double secondNumber )
		throws InvalidRPNMathExpressionException;

}