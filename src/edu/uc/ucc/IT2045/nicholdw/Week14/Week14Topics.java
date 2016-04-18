/*********************************
recursion
optimization
demo of a working program
security?
coding conventions
haiku
java to stand-alone app
enumerated data type
**********************************/

package edu.uc.ucc.IT2045.nicholdw.Week14;

public class Week14Topics {

	// An enumerated data type
	private enum enumIceCream  {vanilla, chocolate, strawberry, coffee};
	
	public static void main(String[] arg) {
		
		// A classic recursion example: the factorial calculation.
		System.out.println("Factorial(10) = " + factorial(10));
		
		
		// An enumerated data type is used to declare a variable
		enumIceCream myIceCream;
		myIceCream = enumIceCream.coffee;		// OK		
//		myIceCream = 42;						// Not OK
		System.out.println("My Ice Cream = " + myIceCream);
		
		long startTime = System.currentTimeMillis();
		int countOfPrimes = 0;
		
//		----------------------------------------------------------------------------------------------------------------------------		
//		Test the efficiency of our prime number checkers. We will count the number of primes from each algorithm as a sanity check.
		int numOfIntegersToCheck = 100000;
//		----------------------------------------------------------------------------------------------------------------------------		
		
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
	
}



