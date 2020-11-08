//Author:Shehnaz Khanam Patan
//Date:06/11/2020
package com.cg.eis.Service;

import com.cg.eis.bean.Employee.Employee;

public interface IEmployeeService {
	
	public void addEmployee(Employee emp);

	public String findInsuranceScheme(Employee emp);

	public void displayEmployeeDetails(String insuranceScheme);

	public boolean deleteEmployee(long employeeId);
}
