package Recursion;

import java.util.Scanner;

public class ReverseNum {
	static int rev=0;

	public static void main(String[] args) {
		System.out.println("Reverse Number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		reverseNum(num);
		System.out.println("The reverse of "+num+" is "+rev);
	}
	
	public static void reverseNum(int n) {
		if(n>0) {
			rev=rev*10+n%10;
			reverseNum(n/10);
		}
	}

}
