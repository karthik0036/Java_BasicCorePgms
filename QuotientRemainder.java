package com.bridge;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend: ");
		int dividend = sc.nextInt();
		System.out.println("Enter divisor: ");
		int divisor = sc.nextInt();
		
		int Quotient = dividend / divisor;
		int  Remainder= dividend % divisor;
		
		System.out.println("the quotient is:"+ Quotient);
		System.out.println("the remainder is:"+ Remainder);
		
		sc.close();
		

	}

}
