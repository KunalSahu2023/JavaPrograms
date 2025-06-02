package Recursion;

import java.util.Scanner;

public class NumCube {
	static int cub=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		cube(num);
		System.out.println("Sum of Cube upto "+num+" is "+cub);
	}
	
	public static void cube(int n) {
		if(n>0) {
			cub=cub+n*n*n;
			cube(n-1);
		}
	}
}
