package com.visp.designpattern.abstractfactory;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("SqlServer insert department.");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("SqlServer query department.");
		
		return null;
	}
}
