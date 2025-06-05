package ArrayLevel02;

public class SumOfPrimeNumber {
	
	public static void main(String[] args) {
		int [] arr= {12,15,17,19,21,59};
		int sum=0;
		
		System.out.println("Prime Number in the Array: ");
		for(int p:arr) {
			if(isPrime(p)){
				System.out.println(p+" ");
				sum=sum+p;
		}
	}
		System.out.println("Total Prime Number is: "+sum);
	}
	
	public static boolean isPrime(int n) {
		if(n<=1)
			return false;
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		
		return true;
	}
}
