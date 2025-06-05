package ArrayLevel02;

public class OriginalSumResultantArray {
	
	public static void main(String[] args) {
		int [] arr = {2,5,4,3,6};
		int sum=0;
		
		System.out.println("Original Array: ");
		
		for(int a:arr) {
			sum=sum+a;
			System.out.print(a+" ");		
		}
		System.out.println();
		
		System.out.println("Resultant Array: ");
		
		for(int a:arr) {
			a=sum-a;
			System.out.print(a+" ");
		}
		
	}
}
