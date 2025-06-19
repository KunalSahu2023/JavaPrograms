package ArrayLevel03;

import java.util.Scanner;

public class KthLargest {

	public static void main(String[] args) {
		int[] a= {90,30,50,25,110,220,98,99,46};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int kth[]=kthLargest(a,n);
		System.out.println(kth+" is kth Largest Element");
	}
	
	public static int[] kthLargest(int[] a, int n) {
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(count==n);
		}
		
		return a;
	}

}
