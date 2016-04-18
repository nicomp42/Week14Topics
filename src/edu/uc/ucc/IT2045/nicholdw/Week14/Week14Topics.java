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
		
		
	}
		
	

	/**
	 * Compute the factorial of a number using recursion.
	 * @param num The number to be computed
	 * @return The factorial of num
	 */
	public static int factorial(int num) {
		if (num ==1) {return 1;}
		return num * factorial(num-1);
	}
	
}



