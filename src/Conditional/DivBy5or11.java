package Conditional;

import java.util.Scanner;

public class DivBy5or11 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num= sc.nextInt();
       System.out.println((num%5== 0 && num%11 == 0)? + num +" is divisible by both 5 and 11" : + num +" is not divisible by 5 and 11");
    }
}
