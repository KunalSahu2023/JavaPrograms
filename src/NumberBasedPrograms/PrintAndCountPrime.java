package NumberBasedPrograms;

import java.util.Scanner;

class PrintAndCountPrime{


    public static void main(String[] args) {

	System.out.println("Enter Range");
	Scanner sc = new Scanner(System.in);
	int range = sc.nextInt();
	int count = 0;
	for(int i = 2; i <=range; i++){
        	if (isPrime(i)) {
            		System.out.print(i + " ");
            		count++;
        	   }
	}
		System.out.println("\nTotal Prime numbers upto "+range+" is: "+count);
}
    
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0)
            return false;

        for (int i = 2; i<n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}