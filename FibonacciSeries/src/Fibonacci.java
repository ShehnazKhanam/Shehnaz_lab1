import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i,a=1,b=1,c=0,t;
		System.out.println("Enter the value of t:");
		t=input.nextInt();
		System.out.print(a);
		System.out.print(" "+b);
		for(i=0;i<t-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		System.out.println();
		System.out.print(t+"th value of the series is: "+c);

	}

}
