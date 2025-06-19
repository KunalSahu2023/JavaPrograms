package Operator;

public class SwapThreeNumber01 {
	public static void main(String[] args) {
		int a=20,b=30,c=40;
		System.out.println("Before Swapping a: "+a +" b: "+b+" c: "+c);
		int d=a;
		a=c;
		c=b;
		b=d;
		System.out.println("Swap Using Fourth Variable");
		System.out.println("a: "+a +" b: "+b+" c: "+c);
	}
}
