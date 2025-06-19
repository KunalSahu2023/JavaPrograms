package Increment;

public class Program06 {

	public static void main(String[] args) {
		int a=10;
		a++;//a:10
		int b=++a; // a:!2 b:11
		int c=a++ + ++b; // a:12 b: 12 c:24
		b++; //12
		System.out.println(a);//12
		System.out.println(b);//13
		System.out.println(c);//24

	}

}
