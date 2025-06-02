package OneDArray;

public class SumOfElements {
	
	public static void main(String[] args) {
		int[] a= {10,189,250,26,303,123,23};
		int sum=0;
		for(int i=0; i<=a.length-1; i++) {
			sum=sum+a[i];
	}
		System.out.println("The Sum Of ELements is: "+sum);
}
}
