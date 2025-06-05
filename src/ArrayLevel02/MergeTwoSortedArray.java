package ArrayLevel02;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		int [] arr1 = {20,30,50,60};
		int [] arr2 = {2,28,32,35,42};
		int [] result = merge(arr1, arr2);
		for(int res: result)
		System.out.print(res+" ");
		
		}
		

	public static int[] merge(int[] a, int[] b) {
	int [] merged = new int[a.length+b.length];
	int idx1=0, idx2=0, idx3=0;
	
	System.out.println("Merge two Sorted Array: ");
	
	while(idx1<a.length && idx2<b.length) {
		if(a[idx1]<b[idx2])
			merged[idx3++]=a[idx1++];
		else 
			merged[idx3++]=b[idx2++];
		}
	while(idx1<a.length)
		merged[idx3++]=a[idx1++];
	while(idx2<b.length)
		merged[idx3++]=b[idx2++];
	
	return merged;
}
}
