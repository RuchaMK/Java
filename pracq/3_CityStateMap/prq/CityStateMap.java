package prq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CityStateMap {
	
	Map<String,String> map = new HashMap<>();

	public void createMapValues(String city,String state) {
		if(map.containsKey(city)) 
			map.replace(city, state);
		else
			map.put(city, state);
	}
	
	public void getAllCities() {
		for(String c : map.keySet()) {
			System.out.println(c + " ");
		}		
	}
	
	
	public void getAllStates(){
		for(String s : map.values()) {
			System.out.println(s + " ");
		}
	}
	
	public void getCities(String state) {
		if(!map.containsValue(state)) {
			System.out.println("State Absent.");
		}
		for(String c : map.keySet()) {
			if(map.get(c).equals(state))
				System.out.println(c);
		}	
	}
	
	
	public void addPair(String state,String city) {
		
		if(map.containsKey(city)) 
			map.replace(city, state);
		else
			map.put(city, state);
		
		
	}
	
	public void deleteAllCities(String state) {
		if(!map.containsValue(state))
			return ;
		Iterator<String> it = map.values().iterator();
		while(it.hasNext()) {
			if(it.next().equalsIgnoreCase(state))
				it.remove();
		}
		
	}
	
}
