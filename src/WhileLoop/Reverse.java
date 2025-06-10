package WhileLoop;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Number: ");
	        int num = sc.nextInt();
	        while(num > 0){
	            int rem = num%10;
	            System.out.print(rem+" ");
	            num/=10;
	        } 
	}
}
