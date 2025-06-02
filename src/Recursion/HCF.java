package Recursion;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {

		System.out.println("Highest Common Factor Program");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		int hcf=getHcf(n1, n2);
		System.out.println("Hcf of "+n1+" and "+n2+" is "+hcf);

	}
	
	public static int getHcf(int a, int b) {
		if(b==0)
			return a;
		return getHcf(b,a%b);
	}

	}

