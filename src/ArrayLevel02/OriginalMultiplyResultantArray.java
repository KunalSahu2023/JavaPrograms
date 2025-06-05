package ArrayLevel02;

public class OriginalMultiplyResultantArray {
	
	public static void main(String[] args) {
		int [] arr = {2,5,4,3,6};
		int prod=1;
		
		System.out.println("Original Array: ");
		
		for(int a:arr) {
			prod=prod*a;
			System.out.print(a+" ");		
		}
		System.out.println();
		
		System.out.println("Resultant Array: ");
		
		for(int a:arr) {
			a=prod/a;
			System.out.print(a+" ");
		}
		
	}
}
