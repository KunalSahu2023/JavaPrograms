package Conditional;

public class Program07 {

	public static void main(String[] args) {
		 int x=5, y=7, z=3;
         int result=(x<y) ? (y<z? x:y) : (x>z ? x:z);
         System.out.println(result);//7

	}

}
