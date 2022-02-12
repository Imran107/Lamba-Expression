package io.javabrains;

public class FunctionAsValue {
	
	
	public void action(){
		// Imagine if we assign a piece of code to a variable.
		// Imagine a function is assigned to a variable.
		
		
		/*aBlockofCode = public void perform(){
			System.out.print("Hello World");
		}*/
		
		//If a function exists in isolation without a class then no need for a modifies here.
		
		/*aBlockofCode = void perform(){
			System.out.print("Hello World");
		}*/
		
		// When we assign a function to a variable, that variable becomes the function name.
		// So no need to provide the function name.
		
		/*aBlockofCode = void(){
			System.out.print("Hello World");
		}*/
		
		//After looking to the method what is the return type of the method, compiler will know in java8, 
		//the return type is void, so need to define the return type.
		
		/*aBlockofCode = (){
			System.out.print("Hello World");
		}*/
		
		// The addition is here an arrow symbol here for the lamba expression.
		
		/*aBlockofCode = () -> {
			System.out.print("Hello World");
		}*/
		
		// If we have only single line in the block of method we can eliminate curly braces as well.
		
		//aBlockofCode = () -> System.out.print("Hello World");
		
		//greetingFunction = () -> System.out.print("Hello World");
		
		/*Greeter greeter = new Greeter();
		greeter.greet(greetingFunction);*/
		
		//doubleNumberFunction = (int a) -> a*2;
		
		//addFunction = (int a , int b) -> a+b;
		
		/*safeDivideFunction = (int a, int b) -> {
			if(b==0) return 0;
			return a/b;
		};*/
		
		//stringLengthCountFunction = (String s) -> s.length;
	}
	
}
