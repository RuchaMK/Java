package prq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CityStateTester {

	public static void main(String[] args) {
		
		CityStateMap csm = new CityStateMap();
		String path = "resource/MyFolder1/MyFolder2/cityMap.txt";
		File file = new File(path);
		BufferedReader br ;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				//System.out.println(line + "\n");
				String[] words = line.split(" ");
				csm.createMapValues(words[0],words[1]);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\nAll cities: ");
		csm.getAllCities();
		
		System.out.println("\nAll states: ");
		csm.getAllStates();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter State: ");
		csm.getCities(sc.next());
		
		String city,state;
		System.out.println("\nAdd Pair ");
		System.out.println("Add City: ");
		city = sc.next();
		System.out.println("Add State: ");
		state = sc.next();
		csm.createMapValues(city, state);
		System.out.println("\nEnter State to check: ");
		csm.getCities(sc.next());
		System.out.println("\nEnter state to Delete: ");
		csm.deleteAllCities(sc.next());
		System.out.println("\nEnter State to check: ");
		csm.getCities(sc.next());
		
		sc.close();
			
	}
		
}
/*OUTPUT
 
All cities: 
Ujjain 
Banglore 
Gwalior 
Satara 
Sangli 
Pune 
Kolkata 
Surat 
Indore 
Akola 
Mumbai 
Bhopal 

All states: 
Madhya-Pradesh 
Karnatak 
Madhya-Pradesh 
Maharashtra 
Maharashtra 
Maharashtra 
West-Bengal 
Gujrat 
Madhya-Pradesh 
Maharashtra 
Maharashtra 
Madhya-Pradesh 

Enter State: 
Maharashtra
Satara
Sangli
Pune
Akola
Mumbai

Add Pair 
Add City: 
Dehu
Add State: 
Maharashtra

Enter State to check: 
Maharashtra
Satara
Sangli
Mumbai
Dehu
Pune
Akola

Enter state to Delete: 
Maharashtra

Enter State to check: 
Maharashtra
State Absent.

 
 
 */
 