package org.tektutor;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTestCase {

	@Test
	public void testSayello() {
		
		App app = new App();
		
		String actualResponse = app.sayHello();
		String expectedResponse = "Hello Apache Maven!";
		
		assertEquals ( expectedResponse, actualResponse );
		
	}

}