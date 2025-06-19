package Increment;

public class Program04 {
	public static void main(String[] args) {
		int a=20;
		a++; //21
		System.out.println("a:"+a);//21
		int b=a++;
		System.out.println("a:"+a);//22
		System.out.println("b:"+b);//21
		int c=++b;
		System.out.println("b:"+b);//22
		System.out.println("c:"+c);//23
		System.out.println(a); //22
		System.out.println(b); //22
		System.out.println(c); //22
	
}	
}
