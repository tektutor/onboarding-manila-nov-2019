package org.tektutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CalculatorRestController {
	
	@Autowired
	private Calculator calculator;
	
	@Bean
	public Calculator getCalculator() {
		return new Calculator();
	}
	
	@GetMapping("/add")
	public double add (@RequestParam(name="x") double x, @RequestParam(name="y") double y ) {
		return calculator.add( x, y);
	}
	
	@GetMapping("/subtract")
	public double subtract (@RequestParam(name="x") double x, @RequestParam(name="y") double y ) {
		return calculator.subtract( x, y);
	}
	
}
