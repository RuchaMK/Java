package pq;
/* 1.Create/Modify your Employee class – Employee can have multiple vehicles.*/
import java.util.ArrayList;
import java.util.List;

public class Employee {
	
		int empID;
		String firstName,lastName,city,domain;
		ArrayList<String> vehicles = new ArrayList<String>();
		
		public Employee() {}
		
		public Employee(int empID, String firstName, String lastName, String city, String domain,
				ArrayList<String> vehicles) {
			super();
			this.empID = empID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.city = city;
			this.domain = domain;
			this.vehicles = vehicles;
		}
		
		public int getEmpID() {
			return empID;
		}

		public void setEmpID(int empID) {
			this.empID = empID;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDomain() {
			return domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public ArrayList<String> getVehicles() {
			return vehicles;
		}

		public void setVehicles(ArrayList<String> vehicles) {
			this.vehicles = vehicles;
		}

		@Override
		public String toString() {
			return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
					+ ", domain=" + domain + ", vehicles=" + vehicles + "]";
		}

	
}


