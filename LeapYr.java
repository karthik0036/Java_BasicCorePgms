package com.bridge;
import java.util.Scanner;

public class LeapYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year : ");
		int year=sc.nextInt();
		if(year<9999) {
			if(((year % 400 == 0)&&(year % 100 !=0)) ||year % 4 ==0){
				System.out.println("its a leap year");
			}
			else {
				System.out.println("its not a leap year");
			}
		}else {
			System.out.println("give a valid 4 digits");
		}
		sc.close();

	}

}
