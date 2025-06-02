package Recursion;

import java.util.Scanner;

public class TowerOfhanoi {

	public static void main(String[] args) {
		
		System.out.println("----------Tower of hanoi--------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of disc");
		int disc=sc.nextInt();
		
		ToH(disc,"A","B","C");
	}
	
	public static void ToH(int n, String from, String aux, String to ) {
	 if(n==1) {	
		 System.out.println("Move disc 1 from "+from+" To "+to);
		 return;
	 } 
	 
	 else {
		 ToH(n-1,from,aux,to);
		 System.out.println("Move disc "+n+" from "+from+" To "+to);
		 ToH(n-1,aux,to,from);
		 
	 }
	}

}
