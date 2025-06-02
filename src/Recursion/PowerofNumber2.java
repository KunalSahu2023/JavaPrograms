package Recursion;

import java.util.Scanner;

public class PowerofNumber2 {
	static long pow=1;

	public static void main(String[] args) {
		System.out.println("Power of number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		long pow=powNum(a,b);
		System.out.println(a+"to power "+b+" is "+pow);
}
	
	public static int powNum(int a, int b) {
		if(b>1)
			return a*powNum(a,b-1);
		else
			return a;
	}
}
