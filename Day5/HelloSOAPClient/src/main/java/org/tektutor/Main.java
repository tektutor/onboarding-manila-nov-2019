package org.tektutor;

public class Main {

	public static void main(String[] args) {

		HelloService helloService = new HelloService();
		
		Hello hello = helloService.getHello();	
		System.out.println( hello.sayHello() );
		
	}

}