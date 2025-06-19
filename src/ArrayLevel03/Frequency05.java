package ArrayLevel03;

import java.util.Scanner;

public class Frequency05 {

	public static void main(String[] args) {
		int[] a = {20,30,20,30,40,50,20,19,50};
		System.out.println("Element is : ");
		frequencyElem(a);

	}
	
	public static void frequencyElem(int[] a) {
		int count=0;
		for(int i=0; i<=a.length;i++) {
			if(a[i]>count)
			{
			int freq=a[i];
			
				count++;
		}
			for(int y:freq)
			System.out.println(y+" is "+count+" times");
		}
	}

	}

