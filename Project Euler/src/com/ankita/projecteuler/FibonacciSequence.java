package com.ankita.projecteuler;

import java.util.Scanner;

/**
 A program to print the fibonacci sequence
 * @author patil
 *
 */
class Fibonacci {
	
	//following method returns the kth fibonacci number
	public static int fibo(int k) {
		
			if (k == 1) {
				return k;
			} else if (k == 2) {
				return k;
			} else return (fibo(k-1)+fibo(k-2));
	}
	
}
public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number of terms in the Fibonacci series");
		int k = src.nextInt();
		int sum = 0;
		//int sumEven = 0;
		System.out.println("Fibonacci series");
		for (int i = 1; i <= k; i++){
			System.out.print(Fibonacci.fibo(i)+"\t");
			int term = Fibonacci.fibo(i);
			sum = sum + term;
			
			//Checks the even valued terms in the Fibonacci series
			/*if(term % 2 == 0) {
				sumEven += term;
			}*/
			
		}
		System.out.println();
		System.out.println("Sum of each term in Fibonacci series is " + sum);
		//System.out.println();
		//System.out.println("Sum of even valued terms in Fibonacci series is "+sumEven);
		
		
	}

}
