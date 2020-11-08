package lab6;
//Author:Shehnaz Khanam Patan

import java.util.*;

public class HashMapSorted {
	public static void main(String[] args) {
		HashMap <Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "Shehnaz");
		hashMap.put(2, "Ayesha");
		hashMap.put(3, "Akbar");
		hashMap.put(4, "Patan");
		List<String> sortedHashMap=new ArrayList<String>();
		sortedHashMap=getValues(hashMap);
		System.out.println(sortedHashMap);
		
		
	}

	private static List<String> getValues(HashMap<Integer, String> hashMap) {
		
		List<String> sortedHashMap=new ArrayList<String>();
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());
		}
		Collections.sort(sortedHashMap);
		
		return sortedHashMap;
	}

}