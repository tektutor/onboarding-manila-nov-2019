package org.tektutor;

import org.junit.Assert;
import org.junit.Test;

public class RPNCalculatorTest {

	@Test
	public void testSimpleAddition() throws InvalidRPNMathExpressionException {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.compute( "10 115 +" );
		double expectedResult = 125.0;
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );

		actualResult = rpnCalculator.compute( "100 5 +" );
		expectedResult = 105.0;
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );
		
	}
	
	@Test
	public void testSimpleSubtraction() throws InvalidRPNMathExpressionException {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.compute( "100 15 -" );
		double expectedResult = 85.0;
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );

		actualResult = rpnCalculator.compute( "100 3 -" );
		expectedResult = 97.0;
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );
		
	}
	
	@Test
	public void testSimpleMultiplication() throws InvalidRPNMathExpressionException {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.compute( "100 15 *" );
		double expectedResult = 1500.0;
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );

		actualResult = rpnCalculator.compute( "100 3 *" );
		expectedResult = 300.0;
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );
		
	}

	
	@Test
	public void testSimpleDivision() throws InvalidRPNMathExpressionException {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.compute( "100.00 10.0 /" );
		double expectedResult = 10.0;
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );

		actualResult = rpnCalculator.compute( "100.000 20.0 /" );
		expectedResult = 5.0;
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );
		
	}
	
	@Test
	public void testComplexMathExpression() throws InvalidRPNMathExpressionException {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.compute( "10 5 * 100 20 / +" );
		double expectedResult = 55.0;
		
		Assert.assertEquals ( expectedResult, actualResult, 0.01 );
		
	}
	
	//@Test(expected=InvalidRPNMathExpressionException.class)
	@Test
	public void testInvalidRPNMathExpression() 
			throws InvalidRPNMathExpressionException {	
		boolean isSuccess = false;
		try {
			RPNCalculator rpnCalculator = new RPNCalculator();
			rpnCalculator.compute( "10 * 5" );
		} catch (InvalidRPNMathExpressionException e) {
			isSuccess = true;
		}
		
		Assert.assertTrue(isSuccess);
	}
	
}