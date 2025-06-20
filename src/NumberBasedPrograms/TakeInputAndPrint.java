package NumberBasedPrograms;

import java.util.Scanner;

class TakeInputAndPrint {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check Prime");
	     	int n = sc.nextInt();
	        if (isPrime(n)) {
	            System.out.println(n + " is a prime");
	        } else {
	            System.out.println(n + " is not a Prime");
	        }
	    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else if (n == 2 || n == 3)
            return true;
        
        for (int i=2;i<n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    
}