package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}

	public static void main(String[] args) {
		
		//Implementing interface through a class
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		helloWorldGreeting.perform();
		
		//Functional interface implementation with lambda function.
		Greeting lambdaGreeting = () -> System.out.println("Hello World");
		lambdaGreeting.perform();
		
		// This is the inline implementation of the interface without creating the Implementation class
		Greeting greeting = new Greeting(){
			public void perform(){
				System.out.println("Hello World!");
			}
		};
		greeting.perform();
		
	}
}