package Recursion;

import java.util.Scanner;

public class CountNumber {
	static int count=0;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int countNum=countNumber(num);
		System.out.println("Total digit in number is "+count);
	}
	public static int countNumber(int n) {
		if(n>0) {
			countNumber(n/10);
			count++;
		}
		else 
			return n;
		return 0;
	}

}
