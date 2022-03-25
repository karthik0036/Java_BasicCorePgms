package com.bridge;


import java.util.Scanner;

public class powerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = sc.nextInt();
		int pwr=1;
		for(int i=0;i<N;i++) {
			pwr*=2;
		}
		System.out.println("2^"+N+" is "+pwr);
		sc.close();
		

	}

}
