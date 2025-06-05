package ArrayLevel01;

public class EvenElement {
	
	public static void main(String[] args) {
		int[] a= {10,18,25,26,33};
		System.out.println("Even Elements in the Array are");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
	}
}
