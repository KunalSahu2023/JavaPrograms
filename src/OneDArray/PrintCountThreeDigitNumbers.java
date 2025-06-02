package OneDArray;

public class PrintCountThreeDigitNumbers {
	
	public static void main(String[] args) {
		int[] a= {10,189,250,26,303,123,23};
		int count=0;
		System.out.println("Three Digits Elements in the Array");
		for(int i=0; i<=a.length-1; i++) {
				if(a[i]>99 && a[i]<=1000) {
					System.out.print(a[i]+" ");
					count++;
				}
		}
		System.out.println();
		System.out.println("Three Digits Number are: "+count);
	}  
}
