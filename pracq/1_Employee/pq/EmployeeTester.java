package pq;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTester {
	List<Employee> allEmployees(){
		int id;
		ArrayList<Employee> emp = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		int tot,vn;

		System.out.println("Enter Number of Employees.");
		tot = sc.nextInt();


		for(int i=0;i<tot;i++) {
			System.out.println("*****Employee Number " + (i+1) + "*****");
			Employee e = new Employee();
			System.out.print("Enter Employee ID: ");
			e.setEmpID(sc.nextInt());
			System.out.print("Enter First Name: ");
			e.setFirstName(sc.next());
			System.out.print("Enter Last Name: ");
			e.setLastName(sc.next());
			System.out.print("Enter City Name: ");
			e.setCity(sc.next());
			System.out.print("Enter Technology: ");
			e.setDomain(sc.next());

			System.out.print("Enter No of Vehicles:");
			vn = sc.nextInt();

			ArrayList<String> vehicles = new ArrayList<String>(); 
			for(int j=0;j<vn;j++) {
				System.out.print("Enter Name of Vehicle " + (j+1) + " :");
				vehicles.add(sc.next());
			}
			e.setVehicles(vehicles);


			/*ArrayList<String> v1 = e.getVehicles();
				for(String veh : v1 ) {
					System.out.println(veh);
				}*/

			emp.add(e);

		}


		sc.close();
		return emp;
	}

	public static void main(String[] args) {

		EmployeeTester et = new EmployeeTester();
		List<Employee> emp = et.allEmployees();
		for(Employee e : emp) {
			System.out.println(e.toString());
		}
	}
}
/*
Enter Number of Employees.
2
*****Employee Number 1*****
Enter Employee ID: 1
Enter First Name: Riya
Enter Last Name: Kul
Enter City Name: Pune
Enter Technology: Java
Enter No of Vehicles:3
Enter Name of Vehicle 1 :Activa
Enter Name of Vehicle 2 :Honda
Enter Name of Vehicle 3 :Pepo
*****Employee Number 2*****
Enter Employee ID: 2
Enter First Name: Rohan
Enter Last Name: Roshan
Enter City Name: RoshanVille
Enter Technology: Python
Enter No of Vehicles:2
Enter Name of Vehicle 1 :Jaguar
Enter Name of Vehicle 2 :Lamborghini
Employee [empID=1, firstName=Riya, lastName=Kul, city=Pune, domain=Java, vehicles=[Activa, Honda, Pepo]]
Employee [empID=2, firstName=Rohan, lastName=Roshan, city=RoshanVille, domain=Python, vehicles=[Jaguar, Lamborghini]]

 
 
 
*/