package org.tektutor;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloSteps {
	private Hello hello;
	private String actualOutput;
	private String greetingMessage;
	
	@Given("I have created a hello object")
	public void createHelloObject() {
		hello = new Hello();
	}

	@Given("I supply {string} as the input")
	public void acceptGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

	@When("I invoke sayHello method")
	public void invokeSayHello() {
		actualOutput = hello.sayHello(greetingMessage);
	}

	@Then("I expect {string} as the output")
	public void verifyOutput(String expectedOutput) {
		Assert.assertEquals( expectedOutput, actualOutput );
	}
}