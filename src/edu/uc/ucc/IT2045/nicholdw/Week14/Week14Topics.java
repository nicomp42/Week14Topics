/*********************************
recursion
optimization
demo of a working program
security?
coding conventions
haiku
java to stand-alone app
**********************************/

package edu.uc.ucc.IT2045.nicholdw.Week14;

public class Week14Topics {

	public static void main(String[] arg) {
		
		// A classic recursion example: the factorial calculation
		System.out.println("Factorial(10) = " + factorial(10));
		
		
	}
		
	

	/**
	 * Compute the factorial of a number
	 * @param num The number to be computed
	 * @return The factorial of num
	 */
	public static int factorial(int num) {
		if (num ==1) {return 1;}
		return num * factorial(num-1);
	}
	
}



