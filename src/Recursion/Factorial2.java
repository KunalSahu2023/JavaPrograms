package Recursion;

import java.util.Scanner;

public class Factorial2 {
	static int fact=1;

	public static void main(String[] args) {
		System.out.println("Factorial Program");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int fact=factorialNum(num);
		System.out.println("The factorial of "+num+" is "+fact);
	}
	
	public static int factorialNum(int n) {
		if(n>1)
			return n*factorialNum(n-1);
		else
			return n;
	}

}
