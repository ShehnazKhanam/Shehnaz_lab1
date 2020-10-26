/*
 	AUTHOR : Patan Shehnaz Khanam
 	
 	PROGRAM : Producing the mirror image of string.
 */
import java.util.*;
import java.lang.*;
public class MirrorString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter a string");
		str=sc.next(); //input a string
		String result=getImage(str);
		System.out.println("Mirror Image is\n "+str+" | "+result);
		
	}

	private static String getImage(String str) {
		// TODO Auto-generated method stub
		StringBuffer result= new StringBuffer(str);
		result.reverse();	//string reversing
		String reverse=result.toString();	//convert to string
		return reverse;
	}
}