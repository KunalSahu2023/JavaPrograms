package ArrayLevel01;

public class ReverseArray {

	public static void main(String[] args) {

		int [] arr= {10,20,30,40,50,60,70};
		int start=0,end=arr.length-1;
		
		System.out.println("Original Array:");
		for(int a:arr)
			System.out.print(a+" ");
		
		System.out.println();
	
		System.out.println("Reverse Array:");
		while(start!=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int b:arr)
			System.out.print(b+" ");
	}

}
