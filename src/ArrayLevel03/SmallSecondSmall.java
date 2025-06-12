package ArrayLevel03;

public class SmallSecondSmall {

	public static void main(String[] args) {
		int[] a= {80, 80, 43, 50, 38, 88, 58, 80};
		smallSecondSmallest(a);
		
	}
	
	public static void smallSecondSmallest(int[] a) {
		int small=a[0], smallSecond=Integer.MAX_VALUE; 
		
		for(int x:a) {
			if(x<small) {
				smallSecond=small;
				small=x;
			}
			else if(x<smallSecond && x!=small){
				smallSecond=x;
			}
		}
		System.out.println("Smallest Element is: "+small);
		System.out.println("Second Smallest Element is: "+smallSecond);
		return;
	}

}
