package Recursion;

import java.util.Scanner;

public class PalindromeNumber {
	static int rev=0;
	
	public static void main(String[] args) {	
	System.out.println("Reverse Number");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	
	rev=0;
	
	if(isPalindromeNum(num))
		System.out.println(num+" is Palindrome");
	else 
		System.out.println(num+" is not a Plaindrome");
}
	
	public static boolean isPalindromeNum(int n) {
		reverseNum(n);
		return n==rev;
	}

	public static int reverseNum(int n) {
		if(n>0) {
			rev=rev*10+n%10;
			return reverseNum(n/10);
		}
		return 0;
	}
}
