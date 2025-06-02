package Recursion;

public class NumberPrint {

	public static void main(String[] args) {
		System.out.println("Print Number from 1 to 10");
		print1To10(1);
		System.out.println("Print Number from 10 to 1");
		print10To1(10);
	}
	
	//Print Number from 1 to 10
	public static void print1To10(int n) {
		if(n<=10) {
			System.out.println(n);
			print1To10(n+1);
		}
	}
	
	//Print Number from 10 to 1
	public static void print10To1(int n) {
		if(n>=1) {
			System.out.println(n);
			print1To10(n-1);
		}
	}
}
