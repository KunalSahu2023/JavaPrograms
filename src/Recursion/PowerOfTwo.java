package Recursion;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

		System.out.println("----------Power of Two--------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(powTwo(num))
			System.out.println(num+" is power of two");
		else
			System.out.println(num+" is not a power of two");
	}
	
	public static boolean powTwo(int n) {
	 if(n==1)	
		 return true;
		if(n==0||n%2!=0) {
			return false;
		}
			return powTwo(n/2);
	}
	}

