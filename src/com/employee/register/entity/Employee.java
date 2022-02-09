package com.employee.register.entity;

public class Employee {
	
	private int id;
	private String Name;
	private int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", age=" + age + "]";
	}

}
