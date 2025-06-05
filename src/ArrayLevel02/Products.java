package ArrayLevel02;

public class Products {
	String brand,name;
	String type;
	double price;
	
	Products(String brand, String name, String type, double price){
		this.brand=brand;
		this.name=name;
		this.type=type;
		this.price=price;
	}
	
	public String getDetails() {
		return "Brand: "+brand+"\tName: "+name+"\tType: "+type+"\tPrice: "+price; 
	}
	
}
