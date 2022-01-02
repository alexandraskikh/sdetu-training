package basics;

public class NumbersCalc {
	
	public static void main (String [] args) {
		System.out.println("Program is starting!");
		printName();
		int numA = 10;
		int numB = 15;
		addNumber (numA, numB);
		System.out.println  ("1.1");
		multiplyNumbers (numA, numB);
		System.out.println  ("1");
		// System.out.println ("The product  of numbers " + numA + " and " + numB + " is " +  multiplyNumbers (numA, numB));
		System.out.println ("The product  of numbers " + numA + " and " + numB + " is " +  multiplyNumbers (numA, numB));
	}

	
	static void printName () {
		
		System.out.println("My name is Sasha!");
		
	}
	
	
	static void addNumber (int numberA, int numberB) {
		
		int sum = numberA + numberB;
		System.out.println("The sum of " + numberA + " and " + numberB + " is " + sum);
	
		
	}
	
	 static int multiplyNumbers (int valueA, int valueB) {
		 
		 int product = valueA*valueB;
		 addNumber (product + 50, product);
		 return product;
		 
	 }

}