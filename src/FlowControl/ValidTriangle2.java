package FlowControl;

import java.util.Scanner;

public class ValidTriangle2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first angle");
		int a=sc.nextInt();
		System.out.println("Enter second angle");
		int b=sc.nextInt();
		System.out.println("Enter third angle");
		int c=sc.nextInt();
		if(a+b+c==180) {
			System.out.println("a: "+a+" b: "+b+" c: "+c);
			System.out.println("Valid Triangle!!");
		}
		else
			System.out.println("Not a Valid Triangle!!");

	}

}
