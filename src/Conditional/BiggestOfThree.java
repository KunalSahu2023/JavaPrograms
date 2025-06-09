package Conditional;

public class BiggestOfThree {

	public static void main(String[] args) {
		int a=30,b=40,c=50;
		int big=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Biggest is: "+big);

	}

}
