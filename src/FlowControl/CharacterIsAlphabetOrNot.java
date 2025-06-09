package FlowControl;

import java.util.Scanner;

public class CharacterIsAlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=sc.next().charAt(0);
		if(c>=65 && c<=90 || c>=97 && c<=122)
			System.out.println(c+" is Alphabet");
		else
			System.out.println(c+" is Not a Alphabet ");
	}

}
