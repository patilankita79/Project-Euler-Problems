package com.ankita.projecteuler;

import java.util.Scanner;

/**
 * Problem 5: Sum Square Difference
 * The sum of the squares of the first ten natural numbers is,
	1^2 + 2^2 + ... + 10^2 = 385
	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)^2 = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers 
	and the square of the sum is 3025 − 385 = 2640.

	Find the difference between the sum of the squares of the first one hundred natural numbers 
	and the square of the sum.
 * @author Ankita Patil
 *
 */
public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = src.nextInt();
		
		int total = 0;
		//following loop calculates the sum of the squares of first n natural numbers
		for (int i = 1 ; i<= n; i++) {
			int squareOfNumber = (int) Math.pow(i, 2);
			total += squareOfNumber;
			//System.out.println(squareOfNumber);
			
			
		}
		
		System.out.println("The sum of the squares of  first "+n+" natural numbers = "+total);
		
		//Following loop calculates the sum of first n natural numbers
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			
		}
		//System.out.println(sum);
		
		//taking square of the sum
		int squareOfsum = (int) Math.pow(sum,2);
		System.out.println("The square of the sum of first "+n+" natural numbers is" + squareOfsum);
		
		int difference = squareOfsum - total;
		System.out.println("The difference between the sum of the squares of the first "+n+" natural numbers square of the sum = "+difference );

	}

}
