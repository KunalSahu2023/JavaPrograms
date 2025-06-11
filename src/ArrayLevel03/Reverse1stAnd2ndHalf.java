package ArrayLevel03;

public class Reverse1stAnd2ndHalf {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		System.out.println("before Reverse:");	
		for(int a:arr)
			System.out.print(a+" ");
		int size=arr.length-1;
		reverse1st2ndHalf(arr,0,size/2);
		reverse1st2ndHalf(arr,size/2+1,size);
		System.out.println("\nAfter Reverse:");
		for(int b:arr)
			System.out.print(b+" ");
	}
		
		public static int[] reverse1st2ndHalf(int[] b, int start, int end) {
			while(start<end) {
				int temp=b[start];
				b[start]=b[end];
				b[end]=temp;
				start++; end--;
			}
			return b;
		}

	}

