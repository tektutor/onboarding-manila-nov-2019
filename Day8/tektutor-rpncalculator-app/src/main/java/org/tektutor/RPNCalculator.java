package org.tektutor;

import java.util.Stack;

public class RPNCalculator {
	private Stack<Double> numberStack;
	private double firstNumber, secondNumber, result;
	
	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstNumber = secondNumber = result = 0.0;
	}

	public double compute(String rpnMathExpression) 
			throws InvalidRPNMathExpressionException {
		
		String[] rpnTokens = rpnMathExpression.split(" ");
		IMathOperation mathOperation = null;
		
		for ( String token : rpnTokens ) {				
			if ( isMathOperator(token) ) {
				extractInputs();
				try  {
					mathOperation = MathFactory.getObject ( token );
					result = mathOperation.compute ( firstNumber, secondNumber );
					numberStack.push(result);
				}
				catch ( Exception e ) {
					throw new InvalidRPNMathExpressionException();
				}
			}			
			else 
				numberStack.push( Double.parseDouble( token ) );
		} 
		
		return numberStack.pop();
	}

	private boolean isMathOperator(String token) {
		String mathOperators = "+-*/";	
		return mathOperators.contains(token);
	}

	private void extractInputs() throws InvalidRPNMathExpressionException {
		try { 
			secondNumber  = numberStack.pop();
			firstNumber = numberStack.pop();
		} catch (Exception e ) {
			throw new InvalidRPNMathExpressionException();
		}
	}
}