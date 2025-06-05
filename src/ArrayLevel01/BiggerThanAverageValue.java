package ArrayLevel01;

public class BiggerThanAverageValue {
	
	public static void main(String[] args) {
		int[] a= {10,189,250,26,303,123,23};
		int sum=0,count=0;
		double avg=0;
		for(int i=0; i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("The Average is: "+avg);
		
		System.out.println("Elements greater Than Average Value");
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]>avg) {
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println("The total bigger element than average value are: "+count);
		
	}
}
