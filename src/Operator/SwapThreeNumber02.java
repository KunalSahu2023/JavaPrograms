package Operator;

public class SwapThreeNumber02 {
	public static void main(String[] args) {
		int a=20,b=30,c=40;
		System.out.println("Before Swapping a: "+a +" b: "+b+" c: "+c);
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		
		System.out.println("Swap Without fourth Variable");
		System.out.println("a: "+a +" b: "+b+" c:"+c);
	}
}
