package ArrayLevel01;

public class BigSmallAndDiff {
	
	public static void main(String[] args) {
		
		int [] arr = {20,24,67,14,78,99,89};
		
		int max=arr[0];
		int min=arr[0];
		int diff=0;
		
		for(int a:arr) {
			if(a>max)
				max=a;
			else if(a<min)
				min=a;
				
			diff=max-min;
		}
		System.out.println("Biggest Element: "+max);
		System.out.println("Smallest Element: "+min);
		System.out.println("Difference: "+ diff);
	}
}
