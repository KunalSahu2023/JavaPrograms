package Recursion;

public class NumSquare {
	
	public static void main(String[] args) {
		System.out.println("Printing Square");
		square(1);
	}
	
	//Print Square of Number from 1 to 10
	
	public static void square(int n) {
		if(n<=10) {
			System.out.println("Square of "+n+" is "+n*n);
			square(n+1);
		}
	}
}
