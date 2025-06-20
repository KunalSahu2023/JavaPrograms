package NumberBasedPrograms;

import java.util.Scanner;

class NthPrimeNumber{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
     	int nth= sc.nextInt();
     	int count=0;
     	for(int i=2;;i++){
			if(isPrime(i)){
				count++;
				if(count==nth){
				System.out.print(nth+" Prime Number is: "+i);
				break;
				}
			}
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
}