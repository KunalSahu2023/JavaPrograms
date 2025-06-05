package ArrayLevel02;

public class SwapTwoIndex {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70};
		
		System.out.println("Resultant Array:");
		
		for(int i=0; i<arr.length; i++) {
			int swap = arr[i+1];
			arr[i+1]=arr[arr.length-2];
			arr[arr.length-2]=swap;
			System.out.print(arr[i]+" ");
		}
	}

}
