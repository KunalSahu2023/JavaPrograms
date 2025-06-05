package ArrayLevel02;

public class Employees {
	String name;
	int id,age;
	double salary;
	
	Employees(String name, int id, int age, double salary){
		this.name=name;
		this.id=id;
		this.age=age;
		this.salary=salary;
	}
	
	public String getDetails() {
		return "Name: "+name+"\tid: "+id+"\tAge: "+age+"\tSalary: "+salary; 
	}
	
}
