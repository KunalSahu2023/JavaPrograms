package OneDArray;

public class SumOfElementsDivBy3 {
	
	public static void main(String[] args) {
		int[] a= {10,189,250,26,303,120,23};
		int sum=0;
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]%3==0) {
				System.out.println(a[i]);
				sum=sum+a[i];
			}
		}
		System.out.println("The Sum Of All ELements which is divisible by 3 is: "+sum);
	}
}
