package ArrayLevel01;

public class ElementsFromEnd {
	
	public static void main(String[] args) {
		int[] a= {10,18,25,26,33};
		System.out.println("Elements in the Array From End");
		for(int i=a.length-1; i>=0; i--) {
				System.out.print(a[i]+" ");
		}
	}
}
