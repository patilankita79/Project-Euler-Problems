package com.ankita.projecteuler;

import java.util.Scanner;

/**
 * Problem 3 - Largest Prime Factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
   What is the largest prime factor of the number 600851475143 ?
 * @author patil
 *
 */

/*
Yahoo Interview Question
*/
class Primefactor{
	public static void findPrimeFactor(long number){
		
		int factor;
		for (factor = 2; factor <= number; factor ++) {
			//Check if the number is divisible by a factor
			while (number % factor == 0) {
				System.out.print(factor +" ");
				number = number / factor;
			}
		}
		System.out.println();
		System.out.print("Largest prime factor of "+number+" is "+(factor - 1));
		
		
	}
}
public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number");
		long number = src.nextLong();
		System.out.println("Prime factors of "+number+" are");
		Primefactor.findPrimeFactor(number);
		
	}

}
