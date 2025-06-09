package FlowControl;

import java.util.Scanner;

public class UpperLowerOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=sc.next().charAt(0);
		if(c>=65 && c<=90)
			System.out.println(c+" is Upper Case");
		else if( c>=97 && c<=122)
			System.out.println(c+" is Lower Case");
		else
			System.out.println(c+" is not upper case not a lower case ");
	}

}
