package ArrayLevel03;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Before Remove Array is:");
		for(int x: arr)
			System.out.print(x+" ");
		
		System.out.println("\nEnter the index");
		int idx=sc.nextInt();
		
		removeElement(arr,idx);
		System.out.println("After Remove Array is:");
		for(int y: arr)
			System.out.print(y+" ");
	}
	
	public static int[] removeElement(int[]a ,int idx) {
		if(idx<=0 || idx>=a.length)
			return a;
		
		int[] b= new int[a.length-1];
		for(int i=0; i<b.length; i++) {
			if(i<idx)
				b[i]=a[i];
			else
				b[i]=a[i+1];
		}
		
		return b;
	}

}
