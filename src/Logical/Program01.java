package Logical;

public class Program01 {
	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean c=true;
		boolean res=(a&&b)||(b&&c); //false||false
		System.out.println(res);//false
	}
}
