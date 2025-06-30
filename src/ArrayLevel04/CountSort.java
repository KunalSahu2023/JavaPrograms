package ArrayLevel04;

public class CountSort {
	public static void main(String[] args) {
		int[] arr= {12,30,11,19,30,19,20};
		
		//O(time) : O(n+k)
		//O(space) : O(n+k)
		
		System.out.println("original Array:");
		for(int x:arr)
			System.out.print(x+" ");
		
		System.out.println("\nSorted Array:");
		
		countSort(arr);
		for(int y:arr)
			System.out.print(y+" ");
	}
	
	public static void countSort(int[] a) {
		int min=a[0], max=a[0];
		for(int x:a) {
			if(x>max)
				max=x;
			else if(x<min)
				min=x;
		}
		int[] freq=new int[max-min+1];
		for(int y:a)
			freq[y-min]++;
		
		for(int i=0,j=0;i<freq.length;i++) {
			while(freq[i]>0) {
				a[j++]=i+min;
				freq[i]--;
			}
		}
	}
}
