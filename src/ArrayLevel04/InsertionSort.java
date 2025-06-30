package ArrayLevel04;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {12,30,11,19,30,19,20};
		
		//O(time) : O(n^2)
		//O(space) : O(1)
		
		System.out.println("original Array:");
		for(int x:arr)
			System.out.print(x+" ");
		
		System.out.println("\nSorted Array:");
		
		insertionSort(arr);
		for(int y:arr)
			System.out.print(y+" ");
	}
	
	public static void insertionSort(int[] a) {
		int n=a.length;
		for(int i=1;i<n;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
