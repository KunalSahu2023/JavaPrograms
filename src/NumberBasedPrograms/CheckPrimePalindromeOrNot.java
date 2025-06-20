package NumberBasedPrograms;

import java.util.Scanner;

class CheckPrimePalindromeOrNot{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
     	int nth= sc.nextInt();
     	int count=0;
     	for(int i=2;;i++){
			if(isPrime(i)&&isPalindrome(i)){
				count++;
				System.out.print(nth+" Prime Number is: "+i);
			}
			System.out.println("\nTotal Such Numbers are: "+count);
     	}
    }
    
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n) {
    	int rev=0; int originalNum=n;
    	while(n>0) {
    		rev=10*rev+n%10;
    		n/=10;
    	}
    	return rev==originalNum;
    }
}