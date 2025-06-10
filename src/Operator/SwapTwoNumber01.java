package Operator;

public class SwapTwoNumber01 {
	public static void main(String[] args) {
		int a=20,b=30;
		System.out.println("Before Swapping a: "+a +" b: "+b);
		System.out.println("Swap Without third Variable");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a +" b: "+b);
	}
}
