package Conditional;

public class Program04 {

	public static void main(String[] args) {
		 int a = 5;
         int b = 10;
         int c=(a>b) ? b++ : (a<b ? --b : b) ;
         System.out.println(c);//9

	}

}
