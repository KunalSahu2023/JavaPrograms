package Operator;

public class ProfitLoss {
	public static void main(String[] args) {
		int SP=400,CP=300;
		System.out.println("Selling Price: "+SP+ " Cost Price: "+CP);
		int profit=(SP-CP)*100/CP;
		System.out.println("Profit: "+profit+"%");
		int loss=(CP-SP)*100/CP;
		System.out.println("Profit: "+loss+"%");
	}
}
