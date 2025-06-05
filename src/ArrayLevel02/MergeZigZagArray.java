package ArrayLevel02;

public class MergeZigZagArray {
	
	public static void main(String[] args) {
		int [] arr1 = {20,30,40};
		int [] arr2 = {2,4,6,8,10};
		int [] merge = new int[arr1.length+arr2.length];
		int idx1=0, idx2=0, x=0;

		while(idx1<arr1.length && idx2<arr2.length) {
				merge[x++]=arr1[idx1++];
				merge[x++]=arr2[idx2++];
		}
		
		while(idx1<arr1.length)
			merge[x++]=arr1[idx1++];
		while(idx2<arr2.length)
			merge[x++]=arr1[idx2++];
	
		System.out.println("Merge Array");
		for(int m:merge)
			System.out.print(m+" ");
		
	}
}
