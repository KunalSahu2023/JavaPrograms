package ArrayLevel02;

public class PrintAndCOuntPalindrome {

		public static void main(String[] args) {
			int [] arr= {11,22,45,67,33,89};
			int [] pal=getPalindrome(arr);
			int count=0;
			for(int p:pal){
			System.out.print(p+" ");
			count++;
			}
		}
		
		public static int[] getPalindrome(int[] a) {
			int [] original = a;
			int i=0, rev=1;
			
			while(i<a.length) {
				rev= a[i]%2;
				rev=rev*10+a[i];
				rev/=10;
			}
			
			if(original==a)
			System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
			
			return original;
			
		}			
}
