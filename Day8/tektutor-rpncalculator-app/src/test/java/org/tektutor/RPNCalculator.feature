Feature: Develop a RPNCalculator application that takes
  	   math expressions in Reverse Polish Notation, 
  	   evaluates the expression and returns the result.

  Scenario Outline: Simple Addition
    Given I have the RPN Calculator object
    And the RPN math expression is <rpnMathExpression>
    When I invoke the compute method
    Then I expect <expectedOutput> as the result
    
    	Examples: 
    		| rpnMathExpression  |  expectedOutput  |
    		| "10 15 +"          |  "25.0"          |
    		| "100 15 +"         |  "115.0"         |
    		| "10 50 +"          |  "60.0"          |    		    		
    		
  Scenario Outline: Simple Subtraction
    Given I have the RPN Calculator object
    And the RPN math expression is <rpnMathExpression>
    When I invoke the compute method
    Then I expect <expectedOutput> as the result
    
    	Examples: 
    		| rpnMathExpression  |  expectedOutput  |
    		| "100 15 -"         |  "85.0"          |
    		| "100 5 -"          |  "95.0"          |
    		| "10 50 -"          |  "-40.0"         |
    		
  Scenario Outline: Simple Multiplication
    Given I have the RPN Calculator object
    And the RPN math expression is <rpnMathExpression>
    When I invoke the compute method
    Then I expect <expectedOutput> as the result
    
    	Examples: 
    		| rpnMathExpression  |  expectedOutput  |
    		| "100 15 *"         |  "1500.0"        |
    		| "100 5 *"          |  "500.0"         |
    		| "20 50 *"          |  "1000.0"        |
    		
  Scenario Outline: Simple Division
    Given I have the RPN Calculator object
    And the RPN math expression is <rpnMathExpression>
    When I invoke the compute method
    Then I expect <expectedOutput> as the result
    
    	Examples: 
    		| rpnMathExpression  |  expectedOutput  |
    		| "100 10 /"         |  "10.0"          |
    		| "100 5 /"          |  "20.0"          |
    		| "200 50 /"         |  "4.0"           |
    		
  Scenario Outline: Complex RPN Math Expression
    Given I have the RPN Calculator object
    And the RPN math expression is <rpnMathExpression>
    When I invoke the compute method
    Then I expect <expectedOutput> as the result
    
    	Examples: 
    		| rpnMathExpression                           |  expectedOutput  |
    		| "10 5 * 100 20 / +"                         |  "55.0"          |
    		| "10 15 7 1 1 + - / 3 * 2 1 1 + + -"         |  "5.0" 	         |
    		| "1 2 + 4 * 5 + 3 -"                         |  "14.0" 	       |        		
    		
    		    		    		