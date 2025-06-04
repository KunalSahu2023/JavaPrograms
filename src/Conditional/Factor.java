package Conditional;

import java.util.Scanner;

public class Factor {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int num1= sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();
       System.out.println((num1%num2== 0)? + num2 +" is a factor of " + num1 : + num2 +" is not a factor of " + num1);
    }
}
