package OneDArray;

public class AverageOfElements {
	
	public static void main(String[] args) {
		int[] a= {10,189,250,26,303,123,23};
		int sum=0;
		double avg;
		for(int i=0; i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("The Average of Array ELements is: "+avg);
		
	}
	
}
