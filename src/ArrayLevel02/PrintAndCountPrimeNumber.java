package ArrayLevel02;

public class PrintAndCountPrimeNumber {
	
	public static void main(String[] args) {
		int [] arr= {12,15,17,19,21,59};
		int count=0;
		
		System.out.println("Prime Number in the Array: ");
		for(int p:arr) {
			if(isPrime(p)){
				System.out.println(p+" ");
			count++;
		}
	}
		System.out.println("Total Prime Number is: "+count);
	}
	
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		if(n==2||n==3)
			return true;
		
		for(int i=2;i*i<=n;i=+2) {
			if(n%i==0)
				return false;
		}
		
		return true;
	}
}
