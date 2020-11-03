package com.cg.eis.exception;
import java.util.*;
/**
 
  @author Patan Shehnaz Khanam
  check the salary of an employee is below 3000 then throw exception
 
 */
public class EmployeeExcep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		int salary = sc.nextInt(); //input from the user
		sc.close();//scanner close
		try {
			/**
			 * check the employee salary is below 3000 then throw SalaryException
			 */
			if (salary < 3000) {
				throw new SalaryExcep();
			} else {
				System.out.println("Salary of an Employee is " + salary); // if salary above 3000 then display employee salary 
			}
		} catch (SalaryExcep e) {
			System.out.println(e.getMessage());// if exception occur then displaying exception message
		}
	}

}