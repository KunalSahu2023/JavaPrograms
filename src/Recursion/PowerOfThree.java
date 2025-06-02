package Recursion;

import java.util.Scanner;

public class PowerOfThree {

	public static void main(String[] args) {
		
		System.out.println("----------Power of Three--------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(powThree(num))
			System.out.println(num+" is power of three");
		else
			System.out.println(num+" is not a power of three");
	}
	
	public static boolean powThree(int n) {
	 if(n==1)	
		 return true;
		if(n==0||n%3!=0) {
			return false;
		}
			return powThree(n/3);
	}

}
