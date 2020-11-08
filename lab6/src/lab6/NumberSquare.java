//Author:Shehnaz Khanam Patan

package lab6;

import java.util.*;

public class NumberSquare {
	public static void main(String[] args) {
		int sqNum[]= {5,6,8,1,4,2};
		Map<Integer,Integer> squareNum=getSquares(sqNum);
		System.out.println(squareNum);
		
	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {
		
		Map<Integer,Integer> squareMap=new HashMap<>();
		for(int square:sqNum) {
			squareMap.put(square,square*square);
		}
		return squareMap;
	}

}