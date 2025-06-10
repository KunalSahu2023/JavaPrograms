package FlowControl;

import java.util.Scanner;

public class ValidTriangle1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first side");
		int a=sc.nextInt();
		System.out.println("Enter second side");
		int b=sc.nextInt();
		System.out.println("Enter third side");
		int c=sc.nextInt();
		if(a+b>c || a+c>b || b+c>a) {
			System.out.println("a: "+a+" b: "+b+" c: "+c);
			System.out.println("Valid Triangle!!");
		}
		else
			System.out.println("Not a Valid Triangle!!");

	}

}
