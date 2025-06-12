package ArrayLevel03;

public class LargestSecondLargest02 {

	public static void main(String[] args) {
		int[] a= {80, 80, 43, 50, 38, 88, 58, 80};
		int secondBiggest=getSecondLArgest(a);
		System.out.println("Second Biggest is: "+secondBiggest);
		
	}
	
	public static int getSecondLArgest(int[] a) {
		int big=a[0], bigSecond=Integer.MIN_VALUE; 
		
		for(int x:a) {
			if(x>big) {
				bigSecond=big;
				big=x;
			}
			else if(x>bigSecond && x!=big)
				bigSecond=x;
		}
		return bigSecond!=-2147483648 ?bigSecond:big;
	}

}
