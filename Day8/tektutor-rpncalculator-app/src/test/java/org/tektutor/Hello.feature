Feature: Develop a Hello Java Class

	Background:
		Given I have created a hello object

	Scenario: Say Hello
		And I supply "World" as the input
		When I invoke sayHello method
		Then I expect "Hello World !" as the output
			
	Scenario: Say BDD		
		And I supply "BDD" as the input
		When I invoke sayHello method
		Then I expect "Hello BDD !" as the output