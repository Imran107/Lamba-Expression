package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}

	public static void main(String[] args) {
		
		// They both behaves exactly the same.
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Hello World");
		
		helloWorldGreeting.perform();
		lambdaGreeting.perform();
		
	}
}