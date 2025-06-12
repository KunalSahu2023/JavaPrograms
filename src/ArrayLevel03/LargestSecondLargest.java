package ArrayLevel03;

public class LargestSecondLargest {

	public static void main(String[] args) {
		int[] a= {80, 80, 43, 50, 38, 88, 58, 80};
		largestSecondLArgest(a);
		
	}
	
	public static void largestSecondLArgest(int[] a) {
		int big=a[0], bigSecond=Integer.MIN_VALUE; 
		
		for(int x:a) {
			if(x>big) {
				bigSecond=big;
				big=x;
			}
			else if(x>bigSecond && x!=big){
				bigSecond=x;
			}
		}
		System.out.println("Biggest Element is: "+big);
		System.out.println("Second Biggest Element is: "+bigSecond);
		return;
	}

}
