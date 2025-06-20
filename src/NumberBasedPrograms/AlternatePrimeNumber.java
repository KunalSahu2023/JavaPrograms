package NumberBasedPrograms;
import java.util.Scanner;

class AlternatePrimeNumber {


    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Range");
     	int range=sc.nextInt();
     	int count=0;
     	for(int i=2;i<=range;i++){
     		if(isPrime(i)){
     			count++;
     			if(count%2==1)
     				System.out.print(i+" ");
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