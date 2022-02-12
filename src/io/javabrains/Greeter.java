package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		MyLambda myLambdaFunction = () -> System.out.println("Hello World");
	}
}

interface MyLambda{
	void perform();
}
