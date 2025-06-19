package Increment;

public class Program07 {

	public static void main(String[] args) {
		int a=12;
		int b=20;
		int c= a++ +b++ - ++a- --a; //a:12 b:20 a:21 b:21 a:20 = 12+20-21-20
		System.out.println(c);//32-41=-11


	}

}
