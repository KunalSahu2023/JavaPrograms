package ArrayLevel03;

public class SmallestSecondSmallest02 {

	public static void main(String[] args) {
		int[] a= {17,39,21,11,34,10,58, 80};
		int secondSmallest=getSecondSmallest(a);
		System.out.println("Second Smallest is: "+secondSmallest);
		
	}
	
	public static int getSecondSmallest(int[] a) {
		int small=a[0], smallSecond=Integer.MAX_VALUE; 
		
		for(int x:a) {
			if(x<small) {
				smallSecond=small;
				small=x;
			}
			else if(x<smallSecond && x!=small)
				smallSecond=x;
		}
		return smallSecond!=2147483647?smallSecond:small;
	}

}
