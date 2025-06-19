package Increment;

public class Program05 {

	public static void main(String[] args) {
		int a=12;
		int b=a++;//b:12 a:12
		b++;//13
		int c=a++ + --b;//a:13 b:12 c:25 
		System.out.println(a);//13
		System.out.println(b);//12
		System.out.println(c);//25


	}

}
