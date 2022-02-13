package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Print inside runnable");
				
			}
			
		});
		
		Runnable lambdaThread = () -> System.out.println("Print inside lambda thread"); 
		lambdaThread.run();

	}

}
