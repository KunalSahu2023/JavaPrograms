package ArrayLevel02;

public class MergeTwoArray {
	
	public static void main(String[] args) {
		int [] arr1 = {1,3,5};
		int [] arr2 = {2,4,6,8,10};
		int [] merge = new int[arr1.length+arr2.length];
		int idx1=0, idx2=0, x=0;
		
		System.out.println("Array1: ");
		while(idx1<arr1.length)
			merge[x++]=arr1[idx1++];
		while(idx2<arr2.length)
			merge[x++]=arr2[idx2++];
		
		System.out.println("Merge Array");
		for(int m:merge)
			System.out.print(m+" ");
		
	}
	
}
