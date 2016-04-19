/*********************************
A cornucopia of Java topics:
Recursion
Optimization
Enumerated data type
Encryption with XOR 

demo of a working program
security?
coding conventions
haiku
java to stand-alone app

**********************************/

package edu.uc.ucc.IT2045.nicholdw.Week14;

public class Week14Topics {

	// An enumerated data type
	private enum enumIceCream  {vanilla, chocolate, strawberry, coffee};
	static long endTime, startTime ;
	
	public static void main(String[] arg) {
				
//		------------------------------------------------------------		
//		A classic recursion example: the factorial calculation.
		System.out.println("Factorial(10) = " + factorial(10));
//		------------------------------------------------------------		

		
//		------------------------------------------------------------		
//		A classic recursion example: the factorial calculation.
		PrimeNumberOptimizationPractice();
//		------------------------------------------------------------		
		
		
//		------------------------------------------------------------				
//		An enumerated data type is used to declare a variable
//		------------------------------------------------------------		
		enumIceCream myIceCream;
		myIceCream = enumIceCream.coffee;		// OK		
//		myIceCream = 42;						// Not OK
		System.out.println("My Ice Cream = " + myIceCream);
		
		
//		-----------------------------------------------------------------------------------------------------------------------------
//		Test our unoptimized max value finder
//		-----------------------------------------------------------------------------------------------------------------------------
		maxValueFinderOptimizationPractice();
		
		
//		-----------------------------------------------------------------------------------------------------------------------------
//		Demonstrate the amazing XOR operator as an encryption tool
//		-----------------------------------------------------------------------------------------------------------------------------
		myXOR();
		
	}

	/***
	 * Find the maximum value in an array
	 */
	private static void maxValueFinderOptimizationPractice() {
		int[] myList = new int[100000000];
			for (int i = 0; i < myList.length; i++) {
				myList[i] = i;
		}
		startTime = System.currentTimeMillis();
		// Run it a bunch of times because it's so fast. 
		int max = 0;
		for (int j = 0; j < 100; j++) {
			max = findMaxValue_Unoptimized(myList);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Max value in array = " + max );
		System.out.println("Total execution time of un-optimized max finder: " + ((double)(endTime - startTime))/1000 + " seconds.");
	}

	/***
	 * Prime Number Optimization
	 */
	private static void PrimeNumberOptimizationPractice() {
//		----------------------------------------------------------------------------------------------------------------------------		
//		Test the efficiency of our prime number checkers. 
//		We will count the number of primes from each algorithm as a sanity check. The counts should be the same.
//		----------------------------------------------------------------------------------------------------------------------------		
		startTime = System.currentTimeMillis();
		int countOfPrimes = 0;
		int numOfIntegersToCheck = 100000;

		for (int i = 2; i < numOfIntegersToCheck; i++) {
		  if (isPrime(i)){ countOfPrimes++;}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(countOfPrimes + " prime numbers identified with the un-optimized method");
		System.out.println("Total execution time of un-optimized prime number tester: " + ((double)(endTime - startTime))/1000 + " seconds.");
		
		startTime = System.currentTimeMillis();
		countOfPrimes = 0;
		for (int i = 2; i < numOfIntegersToCheck; i++) {
			  if (isPrimeOptimized(i)) {countOfPrimes++;}
			}
		endTime = System.currentTimeMillis();
		System.out.println(countOfPrimes + " prime numbers identified with the optimized method");
		System.out.println("Total execution time of optimized prime number tester: " + ((double)(endTime - startTime))/1000 + " seconds.");

	}
	
	
	/**
	 * Compute the factorial of a number using recursion.
	 * @param num The number to be computed
	 * @return The factorial of num
	 */
	public static int factorial(int num) {
		if (num == 1) {return 1;}
		return num * factorial(num-1);
	}
	
	/***
	 * Completely un-optimized prime number checker
	 * @param num The number to check
	 * @return True if num is prime, false otherwise
	 */
	public static boolean isPrime(int num) {
		boolean result = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {result = false;}
		}
		return result;
	}
	
	/***
	 * Optimized(?) prime number checker
	 * @param num The number to check
	 * @return True if num is prime, false otherwise
	 */
	public static boolean isPrimeOptimized(int num) {
		boolean result = true;
		int limit = (int) Math.sqrt(num);
		for (int i = 2; i <= limit; i++) {
			if (num % i == 0) {result = false; break;}
		}
		return result;
	}
	
	/***
	 * Unoptimized.
	 * @param list The array of ints to search.
	 * @return The max value in list
	 */
	public static int findMaxValue_Unoptimized(int[] list) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.length; i++) {
			if (max < list[i]) max = list[i];
		}
		return max;
	}
	
	/***
	 * The amazing XOR operator
	 */
	private static void myXOR() {
		System.out.println("XOR demo...");
		char encryptionKey = 99;
		char clearText = 42;
		char encryptedText = (char) (clearText ^ encryptionKey);
		System.out.println("Clear Text = " + clearText);
		System.out.println("encrypted text = " + encryptedText);
		clearText = (char) (encryptedText ^ encryptionKey);
		System.out.println("Clear Text = " + clearText);
	}
	
}



