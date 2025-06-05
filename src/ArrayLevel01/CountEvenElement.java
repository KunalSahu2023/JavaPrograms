package ArrayLevel01;

public class CountEvenElement {
	
	public static void main(String[] args) {
		int[] a= {10,18,25,26,33};
		int count=0;
		System.out.println("Even Elements in the Array are");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0)
				count++;
		}
		System.out.print("Total even elements in the array is: "+count);
	}
}
