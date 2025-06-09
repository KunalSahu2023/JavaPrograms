package FlowControl;

import java.util.Scanner;

public class UpperLowerDigitSpecial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=sc.next().charAt(0);
		if(c>=65 && c<=90)
			System.out.println(c+" is Upper Case");
		else if( c>=97 && c<=122)
			System.out.println(c+" is Lower Case");
		else if( c>'0' && c<='9')
			System.out.println(c+" is a digit");
		else if((c>=33 && c<=47) || (c>=58 && c<=64) || (c>=123 && c<=126) || (c>=91 && c<=96))
			System.out.println(c+" is a special Character");
			
		else
			System.out.println(c+" is not a valid character ");

	}

}
