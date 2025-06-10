package FlowControl;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a");
		 double a=sc.nextDouble();
		 System.out.println("Enter b");
		 double b=sc.nextDouble();
		 System.out.println("Enter c");
		 double c=sc.nextDouble();
		 //equation : ax^2+bx+c;
		 double d=b*b-4*a*c;
		 System.out.println("Discriminant: "+d);
		
		 if (d>0) {
	            double root1 = (-b + Math.sqrt(d)) / (2 * a);
	            double root2 = (-b - Math.sqrt(d)) / (2 * a);
	            
	            if (Math.sqrt(d) == (int)Math.sqrt(d)) {
	                System.out.println("Roots are real, distinct, and rational.");
	            } else {
	                System.out.println("Roots are real, distinct, and irrational.");
	            }

	            System.out.println("Root 1 = " + root1);
	            System.out.println("Root 2 = " + root2);
	        } else if (d==0) {
	            double root = -b / (2 * a);
	            System.out.println("Roots are real and equal.");
	            System.out.println("Root = " + root);
	        } else {
	            // Complex roots
	            double realPart = -b / (2 * a);
	            double imagPart = Math.sqrt(-d) / (2 * a);

	            System.out.println("Roots are complex and imaginary.");
	            System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
	            System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
	        }
	}

}
