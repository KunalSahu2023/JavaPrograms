package Operator;

public class PrintDigit {

	public static void main(String[] args) {
		int n=5783;
		int digit1=n%10;
		int digit2=(n/10)%10;
		int digit3=(n/100)%10;
		int digit4=(n/1000)%10;
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);

	}

}
