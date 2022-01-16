package com.org.rest;

import java.util.List;
import java.util.ArrayList;
public class Employees {

	private List<Employee> employeeList;
	
	//return list
	public List<Employee> getEmployeeList(){
		if(employeeList == null) {
			employeeList=new ArrayList<>();
		}
		return employeeList;
		
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList=employeeList;
	}
	
	
}
