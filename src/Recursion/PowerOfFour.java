package Recursion;

import java.util.Scanner;

public class PowerOfFour {
	
	public static void main(String[] args) {
		System.out.println("----------Power of Four--------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(powFour(num))
			System.out.println(num+" is power of four");
		else
			System.out.println(num+" is not a power of four");
	}
	
	public static boolean powFour(int n) {
	 if(n==1)	
		 return true;
		if(n==0||n%4!=0) {
			return false;
		}
			return powFour(n/4);
	}
}
