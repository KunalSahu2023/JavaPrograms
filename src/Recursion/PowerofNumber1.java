package Recursion;

import java.util.Scanner;

public class PowerofNumber1 {
	static long pow=1;
	
	public static void main(String[] args) {
		System.out.println("Power of Number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		powerNum(a,b);
		System.out.println(a+" to power "+b+" is: "+pow);
	}
	
	public static void powerNum(int a, int b) {
		if(b>0) {
			pow=pow*a;
			powerNum(a,b-1);
		}
	}
}
