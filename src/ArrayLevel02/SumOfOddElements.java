package ArrayLevel02;

public class SumOfOddElements {
	
	public static void main(String[] args) {
		int[] a= {10,189,250,26,303,120,23};
		int sum=0;
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]%2==1) {
				System.out.println(a[i]);
				sum=sum+a[i];
			}
		}
		System.out.println("The Sum Of All Odd ELements is: "+sum);
	}
}
