//Author:Shehnaz Khanam Patan
//Date:06/11/2020
//Desc:Code for Reference

import java.util.function.Consumer;

public class ReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reference r=new Reference(10,"Sushma");
		Consumer<String> c=r::reference;
		Consumer<String> k=System.out::print;
		k.accept("capgemini");
		System.out.println("\n");
		c.accept("hi");
	}

}
