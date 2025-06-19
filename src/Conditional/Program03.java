package Conditional;

public class Program03 {

	public static void main(String[] args) {
		 int x = 10;
         int y = 5;
         int z = 7;
         int res = (x < y)  ?  (y < z ? z : y)  : x;
         System.out.println(res);//10

	}

}
