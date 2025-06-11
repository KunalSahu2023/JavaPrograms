package ArrayLevel03;

public class ReverseArray {

	public static void main(String[] args) {
			int[] arr= {10,20,30,40,50,60,70};
			System.out.println("before Reverse:");	
			for(int a:arr)
				System.out.print(a+" ");
			
			reverseArr(arr);
			System.out.println("\nAfter Reverse:");
			for(int b:arr)
				System.out.print(b+" ");
		}
			
			public static int[] reverseArr(int[] b) {
				int start=0, end=b.length-1;
				while(start<end) {
					int temp=b[start];
					b[start]=b[end];
					b[end]=temp;
					start++; end--;
				}
				return b;
			}

}
