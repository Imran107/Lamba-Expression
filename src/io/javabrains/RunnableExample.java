package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Print inside runnable");
				
			}
			
		});
		
		myThread.start();
		
		Runnable lambdaThread = () -> System.out.println("Print inside lambda thread"); 
		lambdaThread.run();
		
		Thread runnableThread = new Thread(() -> System.out.println("Print inside lambda thread"));
		runnableThread.run();

	}

}
