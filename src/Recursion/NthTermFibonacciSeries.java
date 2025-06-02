package Recursion;

import java.util.Scanner;

public class NthTermFibonacciSeries {
	
public static void main(String[] args) {
		
		System.out.println("Program to find nth Term Fibonacci");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int nthTerm=sc.nextInt();

		System.out.println("Fibonaccis Series upto "+nthTerm);
		
		for(int i=0; i<=nthTerm; i++)
			System.out.print(nthFibSeries(i)+" ");
			
	}
	
	public static int nthFibSeries(int n) {
		if(n>1) {
			return nthFibSeries(n-1)+nthFibSeries(n-2);
		}
		return n;
	}
}
