package ArrayLevel03;

public class SwapTwoIndex {

	public static void main(String[] args) {
	int[] arr= {10,20,30,40,50,60,70};
	System.out.println("before Swapping:");	
	for(int a:arr)
		System.out.print(a+" ");
	
	SwapIndex(arr);
	System.out.println("\nAfter Swapping:");
	for(int b:arr)
		System.out.print(b+" ");
}
	
	public static int[] SwapIndex(int[] b) {
		int temp=b[1];
		b[1]=b[5];
		b[5]=temp;
		return b;
	}
}
