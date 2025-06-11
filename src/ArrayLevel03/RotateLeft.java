package ArrayLevel03;

public class RotateLeft {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};
		
		leftRotate(a);
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void leftRotate(int[] a) {
		int temp=a[0];
		for(int i=1;i<a.length; i++)
			a[i-1]=a[i];
		a[a.length-1]=temp;
	}
}
