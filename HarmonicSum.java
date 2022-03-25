package com.bridge;

import java.util.Scanner;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Num: ");
		int count = sc.nextInt();
		double harmonicSum=0.0;
		for(int i=1;i<count;i++) {
			if( i < count)
				System.out.print("1/"+ i + " + ");
			else
				System.out.print("1/"+ i);
			
			harmonicSum+=1f/i;
			
		}
		 System.out.println("Harmonic number of "+count+" is: "+harmonicSum);
		 sc.close();
	}
}
		
		

