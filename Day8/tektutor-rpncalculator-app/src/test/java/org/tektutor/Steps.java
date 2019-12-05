package org.tektutor;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	private RPNCalculator rpnCalculator;
	private String rpnMathExpression;
	private double actualResult;
	
	@Given("I have the RPN Calculator object")
	public void createRPNCalculator() {
		rpnCalculator = new RPNCalculator();
	}

	@Given("the RPN math expression is {string}")
	public void acceptRPNMathExpression(String rpnMathExpression) {
		this.rpnMathExpression = rpnMathExpression;
	}

	@When("I invoke the compute method")
	public void invokeComputeMethod() 
			throws InvalidRPNMathExpressionException {
		actualResult = rpnCalculator.compute(rpnMathExpression);
	}

	@Then("I expect {string} as the result")
	public void verifyResult(String strExpectedResult) {
		double expectedResult = Double.parseDouble(strExpectedResult);
		Assert.assertEquals(expectedResult, actualResult, 0.001);
	}

}
