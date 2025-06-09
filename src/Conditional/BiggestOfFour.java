package Conditional;

public class BiggestOfFour {

	public static void main(String[] args) {
		int a=30,b=40,c=50,d=45;
		int big=(a>b?a:b)>(c>d?c:d)?(a>b?a:b):(c>d?c:d);
		System.out.println("Biggest is: "+big);

	}

}
