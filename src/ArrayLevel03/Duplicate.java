package ArrayLevel03;

public class Duplicate {

	public static void main(String[] args) {

		int[] a= {10,10,30,40,10,50,20};
		System.out.print("Original Array:"+ "");
		for(int x: a)
			System.out.print(x+" ");
		System.out.println();
		int[] unique=removeDuplicate(a);
		System.out.println("Array After removing duplicate element");
		for(int x:unique)
			System.out.print(x+" ");
		
		
	}
	public static int[] removeDuplicate(int[] a) {
		boolean counter;
		int newLength=0;
		int[] temp =new int[a.length];
		for(int i=0; i<a.length;i++) {
			counter=false;
			for(int j=0; j<newLength;j++) {
				if(a[i]==a[j]) {
					counter=true;
					break;
				}
			}
			
			  if (!counter) {
	                temp[newLength] = a[i];
	                newLength++;
	            }
		}
		int [] res=new int[newLength];
		for(int y:res)
			res=temp;
		return res;
	}

}
