package Operator;

public class SwapTwoNumber02 {
	public static void main(String[] args) {
		int a=20,b=30;
		System.out.println("Before Swapping a: "+a +" b: "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("Swapping Using third Variable");
		System.out.println("a: "+a +" b: "+b);
	}
}
