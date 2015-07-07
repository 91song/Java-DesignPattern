package com.visp.designpattern.abstractfactory;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("Access insert department.");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("Access query department.");
		
		return null;
	}
}
