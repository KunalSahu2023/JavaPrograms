package ArrayLevel04;

public class SelectionSorting {
	public static void main(String[] args) {
		int[] arr= {12,30,11,19,30,19,20};
		
		//O(time) : O(n^2)
		//O(space) : O(1)
		
		System.out.println("original Array:");
		for(int x:arr)
			System.out.print(x+" ");
		
		System.out.println("\nSorted Array:");
		
		selectionSort(arr);
		for(int y:arr)
			System.out.print(y+" ");
	}
	
	public static void selectionSort(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
	}
}