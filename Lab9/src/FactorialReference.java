//Author:Shehnaz Khanam Patan
//Date:06/11/2020
//Desc:Code to find factorial of given number

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

;

public class FactorialReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> fs=FactorialReference::fact;
			fs.accept(65);
		
		
	}
	public static void fact(int n)
	{
		double prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		System.out.println(prod);
	}
	

}