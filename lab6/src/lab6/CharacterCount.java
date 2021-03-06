//Author:Shehnaz Khanam Patan

package lab6;

import java.util.*;

public class CharacterCount {
	public static void main(String[] args) {
		char[] character= {'d','e','a','r','w','a','d'};
		Map<Character,Integer> charOccurence=countChars(character);
		System.out.println(charOccurence);
	}

	private static Map<Character, Integer> countChars(char[] character) {
		Map<Character,Integer> countChar=new HashMap<Character,Integer>();
		for(char ch:character) {
			if(countChar.containsKey(ch)) {
				countChar.put(ch,countChar.get(ch)+1);
			}
			else {
				countChar.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> entry: countChar.entrySet()) {
			countChar.put(entry.getKey(),entry.getValue());
		}
		return countChar;
	}

}