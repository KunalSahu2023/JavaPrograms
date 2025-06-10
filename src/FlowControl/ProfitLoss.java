package FlowControl;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Selling Price");
		int SP=sc.nextInt();
		System.out.println("Enter Cost Price");
		int CP=sc.nextInt();
		System.out.println("Selling Price: "+SP+ " Cost Price: "+CP);
		if(SP>CP) {
		int profit=(SP-CP)*100/CP;
		System.out.println("Profit: "+profit+"%");
		}
		else {
		int loss=(CP-SP)*100/CP;
		System.out.println("Profit: "+loss+"%");
		}
	}
}
