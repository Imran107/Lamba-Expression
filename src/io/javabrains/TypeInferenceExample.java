package io.javabrains;

public class TypeInferenceExample {
	
	public static void main(String[] args) {
		StringLengthLambda lengthLambda = s -> s.length();
		printLambda(lengthLambda);
	}
	
	public static void printLambda(StringLengthLambda l){
		System.out.println(l.getLength("Hello Lambda"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}

}
