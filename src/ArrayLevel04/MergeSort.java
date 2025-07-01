package ArrayLevel04;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {12,30,11,19,30,19,20};
		
		//O(time) : O(nlogn)
		//O(space) : O(n)
		
		System.out.println("original Array:");
		for(int x:arr)
			System.out.print(x+" ");
		
		System.out.println("\nSorted Array:");
		
		divide(arr,0,arr.length-1);
		for(int y:arr)
			System.out.print(y+" ");

	}
	
	public static void divide(int[] a, int low, int high) {
		int mid=low+(high-low)/2;
		
		if(low<high) {
			divide(a,low,mid);
			divide(a,mid+1,high);
			merge(a,low,mid,high);			
			
		}
	}
	
	public static void merge(int[] a,int low,int mid, int high) {
		int[] merged=new int[high-low+1];
		int idx1=low, idx2=mid+1, x=0;
		
		while(idx1<=mid && idx2<=high) {
			if(a[idx1]<a[idx2])
				merged[x++]=a[idx1++];
			else
				merged[x++]=a[idx2++];
		}
		
		while(idx1<=mid)
			merged[x++]=a[idx1++];
		while(idx2<=high)
			merged[x++]=a[idx2++];
		
		for(int i=low,j=0;j<merged.length;i++,j++)
			a[i]=merged[j];
}
	}
