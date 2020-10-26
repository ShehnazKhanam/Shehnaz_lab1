/*
 	AUTHOR  : Patan Shehnaz Khanam
 	
 	PROGRAM : Duration of the time calculation.
 */
import java.util.*;
import java.text.*;
public class Duration {
	public static void main(String args[]) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String str=formatter.format(date);
		String ch[]=str.split("/");
		System.out.println("Date="+ch[0]);
		System.out.println("Month="+ch[1]);
		System.out.println("Year="+ch[2]);
	}
}