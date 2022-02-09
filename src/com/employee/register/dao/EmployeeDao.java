package com.employee.register.dao;

import java.util.ArrayList;
import java.util.List;

import com.employee.register.entity.Employee;

public class EmployeeDao {

	List<Employee> employeeList = new ArrayList<>();

	public EmployeeDao() {
		employeeList.add(new Employee(1, "Sandeep", 25));
		employeeList.add(new Employee(2, "Rahul", 27));
		employeeList.add(new Employee(3, "Ali", 28));
		employeeList.add(new Employee(4, "Pomi", 17));
	}

	public List<Employee> getEmployeeDao() {
		return employeeList;
	}

}
