package ArrayLevel02;

public class Reverse1stAnd2ndHalfElement {
	
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60,70};
		int [] rev = reverse1stAnd2nd(arr);
		for(int a:rev)
		System.out.print(+a+" ");
		
	}
	
	public static int[] reverse1stAnd2nd(int[] a) {
		
		int start=0,end=a.length-1,mid =(start+end)/2;
		
//		1st Half
		while(start<mid) {
			int temp=a[start];
			a[start]=a[mid];
			a[mid]=temp;
			start++;
			mid--;
		}
		
//		2nd Half
		while(mid+1<end) {
			int temp=a[mid+1];
			a[mid+1]=a[end];
			a[end]=temp;
			mid++;
			end--;
		}
		
		return a;
	}
		
}
