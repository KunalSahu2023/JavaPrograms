package ArrayLevel04;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] arr= {10,23,11,15,18};
		
		//O(time) : O(n^2)
		//O(space) : O(1)
		
		System.out.println("Original Array:");
		for(int x:arr)
			System.out.print(x+" ");
		
		bubbleSort(arr);
		System.out.println("\nSorted Array");
		for(int y:arr)
			System.out.print(y+" ");
	}
	
	public static void bubbleSort(int[] a) {
		int n=a.length;
		int count=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
				}
			}
			if(count==0)
				break;
		}
	}
	
}
