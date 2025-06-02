package Recursion;

import java.util.Scanner;

public class NthTermFibonacci {

	public static void main(String[] args) {
		
		System.out.println("Program to find nth Term Fibonacci");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int nthTerm=sc.nextInt();
		System.out.println("The "+nthTerm +" term is: "+nthFib(nthTerm));
			
	}
	
	public static int nthFib(int n) {
		if(n>1) {
			return nthFib(n-1)+nthFib(n-2);
		}
		return n;
	}

}
