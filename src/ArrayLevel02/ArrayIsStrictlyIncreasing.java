package ArrayLevel02;

public class ArrayIsStrictlyIncreasing {

	public static void main(String[] args) {
		int[] a= {10,30,20,40,60,70};
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[i+1])
				System.out.println("Array is Strictly increasing");
		else
			System.out.println("Array is not Strictly Increasing");
		}

	}

}
