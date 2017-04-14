package com.ankita.projecteuler;

import java.util.Scanner;

/**
 * A program to check if the number is palindrome
 * A palindromic number reads the same both ways.
 * @author patil
 *
 */
class Palindrome {
	//Following function returns the reverse of a number
	public static int reverse(int number) {
		int reverseNumber = 0;
		int unitDigit;
		
		while (number != 0) {
			
			//Extracting the unit digit, i.e. getting the remainder
			unitDigit = number % 10;
			reverseNumber = reverseNumber * 10 + unitDigit;
			number = number / 10;
		}
		return reverseNumber;
	}
	
	//Following function checks if the reverse of a number equals original number
	public static boolean isPalindrome(int number) {
		if (reverse(number) == number) 
			return true;
		else return false;
		
	}
}
public class PalindromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = src.nextInt();
		//int result = Palindrome.reverse(number);
		//System.out.println(result);
		if(Palindrome.isPalindrome(number)) {
			System.out.println(number+" is palindrome");
		} else {
			System.out.println(number+ " is not a palindrome");
		}
		
	}
}
