import java.util.*;
public class TrafficLight {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("red\nyellow\ngreen");
		 String s=sc.next();
		 if(s=="red")
		 {
			 System.out.println("stop");
			 
		 }
		 else if(s=="yellow")
		 {
			 System.out.println("ready");
		 }
		 else
		 {
			 System.out.println("go");
		 }
	

}
}
