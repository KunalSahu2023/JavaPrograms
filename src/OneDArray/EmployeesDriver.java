package OneDArray;

import java.util.Scanner;

public class EmployeesDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employees [] emp = new Employees[10];
			
		emp[0]= new Employees("Rohan",203,25,13450.60);
		emp[1]= new Employees("Sohan",205,27,33450.60); 
		emp[2]= new Employees("Manohan",206,28,53450.60); 
		emp[3]= new Employees("Mohan",207,23,63450.60); 
		emp[4]= new Employees("RamMohan",208,39,33450.60); 
		emp[5]= new Employees("Noohaan",205,23,23450.60); 
		emp[6]= new Employees("Aman",203,23,33450.60); 
		emp[7]= new Employees("Namnn",2014,26,44450.60); 
		emp[8]= new Employees("Hanom",230,33,53450.60); 
		emp[9]= new Employees("Chaman",223,32,73450.60); 
		
		char c;
		do {
			System.out.println("Enter from below Options");
			System.out.println("Press 1 for Acces all the Employees Details");
			System.out.println("Press 2 for print and count all employee with age <30 years");
			System.out.println("Press 3 for Print the details of employee with highest and least salary");
			System.out.println("Press 4 for search Whether an employee is available or not by id");
			System.out.println("Press 5 for search Whether an employee is available or not by name");
			System.out.println("Press 6 for Count and print all the employee whose salary is more than average salary");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1: // a) access all the employees.
				acessAllEmployeeDetails(emp);
				System.out.println("===================================");
				break;
				
			case 2 : //  b) print and count all employee with age <30 years.
				accessAllEmployeesWithAge(emp);
				System.out.println("===================================");
				break;
				
			case 3: // c) print the details of employee with highest and
//				least salary.
				employeesWithHighestAndLeastSalary(emp);
				System.out.println("===================================");
				break;
				
			case 4: // d) Search whether an employ is available or not by
//				id
				System.out.println("Enter Id");
				int id =sc.nextInt();
				searchWithID(emp,id);
				System.out.println("===================================");
				break;
				
			case 5: // 	e) Search whether an employ is available or not by
//				name.
				System.out.println("Enter Name");
				sc.nextLine();
				String name=sc.nextLine();
				searchWithName(emp,name);
				System.out.println("===================================");
				break;
				
			case 6: // f) Count and print all the employee whose salary is
//				more than average salary.
				greaterthanAverageSalary(emp);
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
	
	public static void acessAllEmployeeDetails(Employees[] emp) {
		for(Employees e:emp)
			System.out.println(e.getDetails());
	}
	
	public static void accessAllEmployeesWithAge(Employees[] emp) {
		for(Employees e:emp) {
			if(e.age<30)
			System.out.println(e.getDetails());
		}
	}
	
	public static void employeesWithHighestAndLeastSalary(Employees[] emp) {
		Employees max=emp[0];
		Employees min=emp[0];
		for(Employees e:emp) {
			System.out.println("Details with Highest Salary: "+max.getDetails());
			System.out.println("Details with Least Salary: "+min.getDetails());
			}
	}
	
	
	public static void searchWithID(Employees[] emp, int id) {
		for(Employees e:emp) {
			if(e.id==id) {
				System.out.println("Employee is found");
				System.out.println(e.getDetails());
			}
		}
		System.out.println("Employee with Id: "+id+" is Not Found");
	}
	
	public static void searchWithName(Employees[] emp, String name) {
		int count=0;
		for(Employees e:emp) {
			if(e.name.equalsIgnoreCase(name)){
				System.out.println("Employee is found");
				System.out.println(e.getDetails());
				count++;
			}
		}
		if(count==0)
		System.out.println("Employee with Id: "+name+" is Not Found");
	}
	
	public static void greaterthanAverageSalary(Employees[] emp) {
		double sum=0;
		for(Employees e: emp)
			sum=sum+e.salary;
			double avg=sum/emp.length;
			System.out.println("Average Salary: "+avg);
			int count=0;
			for(Employees e: emp) {
				if(e.salary>avg)
					System.out.println(e.getDetails());
				count++;
			}
			System.out.println("Total Employees are: "+count);
		}
	}

