package Recursion;

import java.util.Scanner;

public class Factorial1 {
	static int fact=1;
	
	public static void main(String[] args) {
		System.out.println("Factorial");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		factorialNum(n);
		System.out.println(n+"! is: "+fact);
	}
	
	public static void factorialNum(int num) {
		if(num>0) {
			fact=fact*num;
			factorialNum(num-1);
		}
	}
}
