package com.ankita.projecteuler;

import java.util.Scanner;

/**
 * A program to find the prime factors of a number
 * @author patil
 *
 */
public class PrimeFactorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = src.nextInt();
		
		for(int factor = 2; factor <= n; factor ++) {
			while (n % factor == 0){
				System.out.print(factor +" ");
				n = n /factor;
			}
		}
	}

}
