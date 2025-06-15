package ArrayLevel03;

public class ArrayIsSortedOrNot {
	
	public static void main(String[] args) {
		int [] a= {10,20,12,28,32,40};	
		System.out.println("Original Array is:");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		if(isSorted(a))
			System.out.println("Array is Sorted");
		else
			System.out.println("Array is not sorted");
			
	}
	public static boolean isSorted(int[] a) {
		for(int i=0; i<a.length; i++)
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[j+1])
					return true;
		
		return false;
		
	}
		return false;
	
	}
}
