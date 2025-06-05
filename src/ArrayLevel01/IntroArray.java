package ArrayLevel01;

public class IntroArray {
	
	public static void main(String[] args) {
		int [] a = {10,20,30,40};
		System.out.println(a); //[I@27f674d
		System.out.println(a.length); //4  
		System.out.println(a[0]); //10
		System.out.println(a[1]+a[3]); //60
		System.out.println(a[a.length-1]); //40
		System.out.println(a[6]); //index out of bound exception
		
	}
}
