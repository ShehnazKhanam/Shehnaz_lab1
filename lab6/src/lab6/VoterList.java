//Author:Shehnaz Khanam Patan

package lab6;

import java.util.*;

public class VoterList {
	public static void main(String[] args) {
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();
		voterList.put(101, 38);
		voterList.put(102, 15);
		voterList.put(103, 27);
		voterList.put(104, 69);
		List<Integer>voterDetails=votersList(voterList);
		System.out.println(voterDetails);
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		List<Integer> voterDetails=new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {
			if(entry.getValue()>18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;
	}

}