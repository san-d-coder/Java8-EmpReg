package com.employee.register.controller;

import java.util.List;

import com.employee.register.entity.Employee;
import com.employee.register.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		List<Employee> legalEmployees = service.getLegalEmployees();
		legalEmployees.stream().forEach(System.out::println);
	}

}
