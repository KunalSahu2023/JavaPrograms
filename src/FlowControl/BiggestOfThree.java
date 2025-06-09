package FlowControl;

public class BiggestOfThree {
	public static void main(String[] args) {
		int a=45,b=45,c=45;
		if(a==b&&b==c)
			System.out.println("All are Equal");
		else if(a>b && a>c)
			System.out.println(a+" is Biggest");
		else if(b>a && b>c)
			System.out.println(b+" is Biggest");
		else
			System.out.println(c+" is biggest");
	}
}
