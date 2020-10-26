/*
 	AUTHOR  : Patan Shehnaz Khanam
 	
 	PROGRAM : Checking positive sentence or not.
 */
import java.util.*;
public class PositiveNegative {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String"); //input
		String r = sc.nextLine();
		
		String str = checkPositive(r);
		
	}
	
	public static String checkPositive(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i+1)<str.charAt(i)) //check character one by one is alphabetic order 
			{
				System.out.println("Not Positive String");
			}else {
				System.out.println("Positive String");
			}
	}
	return str;
	}

}