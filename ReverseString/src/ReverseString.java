
import java.util.Arrays;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[4];
		System.out.println("Enter array values:");
		for(int i=0;i<4;i++) {
		  a[i]=sc.nextInt();
		  }
		ReverseString obj=new ReverseString();
		obj.revArray(a);
	}

void revArray(int a[])
{
		String str=Arrays.toString(a);
		
	    Arrays.sort(a);
	    System.out.println("sorted array is:"+Arrays.toString(a));
	    
	}


}