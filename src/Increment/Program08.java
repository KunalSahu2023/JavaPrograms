package Increment;

public class Program08 {
	
	public static void main(String[] args) {
		int x=10;
		int y=5;
		int z=x-- - --y + x++ + ++y; // x:10-y:4+a:9+y:5 
		System.out.println(z);//14

	}
}
