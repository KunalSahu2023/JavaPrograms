package ArrayLevel03;

import java.util.Scanner;

public class Frequency04 {

	public static void main(String[] args) {
		int[] a = {20,30,20,30,40,50,20,19,50};
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		getKthLargest(a,k);
//		System.out.println(getKthFrequency);



	}
	
	public static int getKthLargest(int[] a, int k) {
		int max=a[0], min=a[0];
		for(int x:a) {
			if(x>max)
				max=x;
			else if(x<min)
				min=x;
		}
		int[] freq = new int[max-min+1];
		for(int y:a)
			freq[y-min]++;
		for(int i=freq.length-1;i>=0;i--) {
			if(freq[i]>0)
				k-=freq[i];
				if(k<=0)
					return i+min;
		}
		return max;
	}

	}

