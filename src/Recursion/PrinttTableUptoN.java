package Recursion;

import java.util.Scanner;

public class PrinttTableUptoN {
			
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("-----------Multiplcation Table------------");
			System.out.println("Enter the number");
			int n =sc.nextInt();
			printTableUptoN(n,1,1);
		}
		
		public static void printTableUptoN(int n,int p,int i) {
			if(p<=n) {
				printTable(p,i);
				System.out.println("---------------------------");
				printTableUptoN(n,p+1,1);
			}
		}
		
		public static void printTable(int n, int i) {
			if(i<=10) {
				System.out.println(n+"*"+i+"="+n*i);
				printTable(n,i+1);
			}
		}
	}
