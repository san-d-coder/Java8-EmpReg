package com.employee.register.service;

import java.util.List;

import com.employee.register.dao.EmployeeDao;
import com.employee.register.entity.Employee;

public class EmployeeService {
	
	EmployeeDao dao = new EmployeeDao();
	
	public List<Employee> getLegalEmployees(){
		return dao.getEmployeeDao().stream().filter(e->e.getAge()>18).toList();
	}

}
