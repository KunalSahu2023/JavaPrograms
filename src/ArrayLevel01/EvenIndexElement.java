package ArrayLevel01;

public class EvenIndexElement {
	public static void main(String[] args) {
		int [] a = {10,21,32,45,48};
		System.out.println("Even Elements index elements inthe array");
		for(int i=0; i<a.length; i+=2) {
				System.out.println("index "+i+" is " +a[i]+" ");
		}
	}
}
