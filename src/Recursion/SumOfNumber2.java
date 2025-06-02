package Recursion;

import java.util.Scanner;

public class SumOfNumber2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number");
		int n=sc.nextInt();
		int sum=sumNum(n);
		 System.out.println("the sum of number upto "+n+" is "+sum);
	}
	
	public static int sumNum(int num) {
		if(num>1)
			return num+sumNum(num-1);
		else
			return num;
	}
}
