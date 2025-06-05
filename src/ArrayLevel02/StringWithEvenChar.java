package ArrayLevel02;

public class StringWithEvenChar {
	
	public static void main(String[] args) {
		
		String str[] = {"abc","abcde","abcd","gefg","efh","ef"};
		int count=0;
		
		System.out.println("String with Even Characters are:");
		
		for(String s:str) {
			if(s.length()%2==0) {
				System.out.println(s);
				count++;
			}
		}
		System.out.println("Total Even Character: "+count);
	}
}
