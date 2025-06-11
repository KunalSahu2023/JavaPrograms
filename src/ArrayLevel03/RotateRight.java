package ArrayLevel03;

public class RotateRight {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};
		
		rightRotate(a);
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void rightRotate(int[] a) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=temp;
	}
}
