package ArrayLevel02;

import java.util.Scanner;

public class ProductsDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Products[] prod= new Products[10];
		prod[0]= new Products("Samsung","Galaxy s13","Mobile",70000);
		prod[1]= new Products("Sony","Wh1300X","Electronics",35000);
		prod[2]= new Products("Xiaomi","Redmi Note 13 Pro","Mobile",30000);
		prod[3]= new Products("Nike","Galaxy s13","Footwear",8000);
		prod[4]= new Products("Hp","15s","Laptop",60000);
		prod[5]= new Products("Nik","Slim fit Jeans","Shirt",2500);
		prod[6]= new Products("Levi's","Shirt","Shirt",1500);
		prod[7]= new Products("Adidas","Galaxy s13","Footwear",6000);
		prod[8]= new Products("Asus","Vivo Book","Laptop",70000);
		prod[9]= new Products("Samsung","65 QLED Smart TV","Electronics",7500);
		
		char c;
		do {
			System.out.println("Enter from below Options");
			System.out.println("Press 1 for accessProductsAsPer");
			System.out.println("Press 2 for Access all shirt products.");
			System.out.println("Press 3 for Access all shirts in price range from 1500- 2500.");
			System.out.println("Press 4 d) Access all products for a particular brand as per\r\n"
					+ "requirements.");
			System.out.println("Press 5 Access all the electronics products.");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1: // a) access all the employees.
				acessAllProductsDetails(prod);
				System.out.println("===================================");
				break;
				
			case 2 : //  b) print and count all employee with age <30 years.
				System.out.println("Enter Type");
				sc.next();
				String type=sc.nextLine();
				accessAllShirts(prod,type);
				System.out.println("===================================");
				break;
				
			case 3: // c) print the details of employee with highest and
//				least salary.
				System.out.println("Enter type");
				sc.nextLine();
				String type2=sc.nextLine();
				System.out.println("Enter price");
				double price=sc.nextDouble();
				shirtWithRange(prod,type2,price);
				System.out.println("===================================");
				break;
				
			case 4: // d) Search whether an employ is available or not by
//				id
				System.out.println("Enter price");
				double price1=sc.nextDouble();
				accessProductsAsPer(prod, price1);
				System.out.println("===================================");
				break;
				
			case 5: // 	e) Search whether an employ is available or not by
//				name.
				System.out.println("Enter Type");
				sc.nextLine();
				String type1=sc.nextLine();
				acessElectronics(prod,type1);
				System.out.println("===================================");
				break;
				
				default :
					System.out.println("Invalid Choice!! Try again");
					System.out.println("==============================");
			}
			System.out.println("Program Ends!!");
			
			System.out.println("Press Y or y to cotinue");
			c=sc.next().charAt(0);
		}while(c=='y' || c=='y');

	}
	
	public static void acessAllProductsDetails(Products[] prod) {
		for(Products p:prod)
			System.out.println(p.getDetails());
	}
	
	public static void accessAllShirts(Products[] prod, String type) {
		for(Products p :prod) {
			if(p.type=="Shirt")
			System.out.println(p.getDetails());
		}
	}
	
	public static void shirtWithRange(Products[]prod,String type,double price){
		for(Products p:prod) {
			if(p.type=="Shirt" && (p.price>1500 && p.price<2500))
			System.out.println(p.getDetails());
			}
	}
	public static void accessProductsAsPer(Products[] prod, double price) {
		for(Products p:prod) {
			if(p.price==price) {
				System.out.println(p.getDetails());
			}
		}
	}
	
	public static void acessElectronics(Products[] prod, String type) {
		for(Products p:prod) {
			if(p.type=="Shirts"){
				System.out.println(p.getDetails());
			}
		}
	 }
	
	}

