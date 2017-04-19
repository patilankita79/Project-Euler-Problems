package com.ankita.projecteuler;

import java.util.Scanner;

/**
 * Problem 4: Largest Palindrome Product: Largest Palindrome which is a product of two n digit numbers
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 * @author Ankita Patil
 *
 */
/**
 * Logic applied
 * Largest Palindrome which is a product of two n digit numbers
 * 1. Find a lower limit on n digit number
 * 2. Find a upper limit on n digit number
 * 3. consider all pairs of numbers where every number lies in the range of (lower limit, Upper limit )
 * 4. Take the product of pair
 * 5. Check if the product is the maximum product as well as palindrome
 * @author Ankita Patil
 *
 */

/*
Yahoo Interview Question
*/
class Operations {
	//private int numberOfdigit;
	
//	public Operations(){
//		this.numberOfdigit = numberOfdigit;
//	}
	
	//Following function calculates the largest number of n-digit or upper limit of n-digit
	public int upperLimit(int numberOfDigit) {
		int upperLimit = 0;
		
		for (int i = 1; i <= numberOfDigit; i++ ) {
			
			upperLimit = upperLimit * 10;
			upperLimit = upperLimit + 9;
			
		}
		return upperLimit;
	}
	
	//following function returns the smallest number of n-digit or lower limit of n-digit
	public int lowerLimit(int numberOfDigit) {
		
		return (1 + upperLimit(numberOfDigit) /10);
	}
	
	//following function returns the reverse of a number
	public long reverse(long number) {
		
		long reverseNumber = 0;
		long unitDigit;
		
		while (number != 0) {
			
			//Extracting the unit digit, i.e. getting the remainder
			unitDigit = number % 10;
			reverseNumber = reverseNumber * 10 + unitDigit;
			number = number / 10;
		}
		
		return reverseNumber;
		
	}
	
	//following function checks if the number is palindrome
	public boolean isPalindrome(long number) {
		if (reverse(number) == number) 
			return true;
		else return false;
		
	}
	
	public long product(int lowerLimit, int upperLimit) {
		long maxProduct = 0;
		
		for (int i = upperLimit; i >= lowerLimit; i--) {
			for (int j = i; j >= lowerLimit; j--) {
				
				long productOfTwoNumbers = i * j;
				if (productOfTwoNumbers < maxProduct)
					break;
				
				long number = productOfTwoNumbers;
				//Update the new product if and only if number is palindrome and product is greater than maximum product
				if (isPalindrome(number) && productOfTwoNumbers > maxProduct)  {
					maxProduct = productOfTwoNumbers;
				}
				
			}
		}
		
		return maxProduct;
	}
}
public class LargestPalindromeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number of digits");
		int numberOfDigit = src.nextInt();
		Operations o = new Operations();
		
		int upperLimit = o.upperLimit(numberOfDigit);
		int lowerLimit = o.lowerLimit(numberOfDigit);
		
		System.out.println("Largest " +numberOfDigit+"-digit number : " +upperLimit);
		System.out.println("Smallest " +numberOfDigit+"-digit-number : " +lowerLimit);
		
		long result = o.product(lowerLimit, upperLimit);
		System.out.println("The largest palindrome made from the product of two "+ numberOfDigit +"-digit number is "+result);
		
	}

}
