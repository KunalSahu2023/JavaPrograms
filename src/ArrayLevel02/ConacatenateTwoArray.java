package ArrayLevel02;

public class ConacatenateTwoArray {

	public static void main(String[] args) {
		
		int [] arr1 = {20,30,50,60};
		int [] arr2 = {2,28,32,35,42};
		int [] concate = concate(arr1,arr2);
	}
		
		
	public static int[] concate(int[] a, int[] b) {
	int [] concate = new int[a.length+b.length];
	
	System.out.println("Concatenation two Sorted Array: ");
	
	for(int i=0;i<a.length;i++)
		concate[i]=a[i];
	for(int i=0;i<b.length;i++)
		concate[a.length+1]=a[i];
	
	return concate;
}

	}
