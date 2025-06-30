package NumberBasedPrograms;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {12,30,11,19,30,19,20};
		
		//O(time) : O(nlogn)
		//O(space) : O(n)
		
		System.out.println("original Array:");
		for(int x:arr)
			System.out.print(x+" ");
		
		System.out.println("\nSorted Array:");
		
		mergeSort(arr);
		for(int y:arr)
			System.out.print(y+" ");

	}
	
	public static void mergeSort(int[] a) {
		
	}

}
