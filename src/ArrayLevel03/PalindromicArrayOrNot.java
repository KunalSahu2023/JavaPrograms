package ArrayLevel03;

public class PalindromicArrayOrNot {

	public static void main(String[] args) {
		int [] a = {10,20,30,40,30,20,10};
		
		if(isPalindromicArr(a))
			System.out.println("Is a Palindromic Array");
		else
			System.out.println("Not A Palindromic Array");

	}
	public static boolean isPalindromicArr(int [] b) {
		int start=0, end=b.length-1;
		while(start<end) {
			if(b[start]!=b[end])
				return false;
			start++; end--;
		}
		return true;
	}

}
