package ArrayLevel02;

public class LargestString {
	
	public static void main(String[] args) {
		String str[] = {"abc","abcde","abefgcd","gefg","efhef","ef"};
		String max=str[0];
		
		System.out.println("Array String with Largest string :");
		
		for(String s:str) {
			if(s.length()>max.length())
			{
				
				max=s;
			}
			
			
		}
		System.out.println("Largest String: "+max);
	}
}
