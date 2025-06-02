package Recursion;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		System.out.println("Least Common Multiplier Program");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		int lcm=getLcm(n1, n2, Math.max(n1, n2));
		System.out.println("Lcm of "+n1+" and "+n2+" is "+lcm);

	}
	
	public static int getLcm(int a, int b, int multiplier ) {
		if(multiplier%a==0 && multiplier%b==0)
			return multiplier;
		return getLcm(a, b, multiplier+1);
	}

}
