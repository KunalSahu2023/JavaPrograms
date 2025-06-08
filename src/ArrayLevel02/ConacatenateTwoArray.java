package ArrayLevel02;

public class ConacatenateTwoArray {

	public static void main(String[] args) {
		
		int [] arr1 = {20,30,50,60};
		int [] concate = concate(arr1);
		for(int c: concate)
			System.out.print(c+" ");
		
	}
		
		
	public static int[] concate(int[] a) {
	int [] concate = new int[2*a.length];
	
	System.out.println("Concatenation of Sorted Array: ");
	
	for(int i=0;i<a.length;i++) {
		concate[i]=a[i];
		concate[a.length+1]=a[i];
	}
	
	return concate;
}

	}
