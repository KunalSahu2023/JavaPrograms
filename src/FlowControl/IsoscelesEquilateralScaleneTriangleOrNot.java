package FlowControl;

import java.util.Scanner;

public class IsoscelesEquilateralScaleneTriangleOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first side");
		int a=sc.nextInt();
		System.out.println("Enter second side");
		int b=sc.nextInt();
		System.out.println("Enter third side");
		int c=sc.nextInt();
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		if(a==b&&b==c) // all three angle are equal(60deg)
			System.out.println("Triangle is a Equilateral!!");
		else if(a==b&&a!=c) // opposite angle are equals
			System.out.println("Triangle is a Isosceles!!");
		else if(a!=b&&a!=c) // all angles are not equal
			System.out.println("Triangle is a Scalene!!");
	}

}
