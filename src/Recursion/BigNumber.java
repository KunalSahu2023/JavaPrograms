package Recursion;

public class BigNumber {
	
	public static void main(String[] args) {
		int a=72, b=56, c=76, d=68, e=78, f=45, g=87, h=56, i=54, j=89, k=99, l=99;
		int big1=big(big(a,b),c);
		int big2=big(big(d,e),big(f,g));
		int big3=big(big(big(h,i),big(j,k)),l);
		System.out.println("Biggest of a,b,c is: " +big1);
		System.out.println("Biggest of d,e,f,g is: " +big2);
		System.out.println("Biggest of f,i,j,k is: " +big3);
	}
	
	public static int big(int x, int y) {
		return x>y?x:y;
	}
}
