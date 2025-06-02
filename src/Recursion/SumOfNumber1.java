package Recursion;

public class SumOfNumber1 {
	static int sum=0;
	
	public static void main(String[] args) {
		System.out.println("Printing Sum of Number");
		sumNumber(100);
		System.out.println("the sum of number is: "+sum);
	}
	
	public static void sumNumber(int n) {
		if(n>0) {
			sum=sum+n;
			sumNumber(n-1);
		}
		
	}
}
