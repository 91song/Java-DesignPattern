package com.visp.designpattern.abstractfactory;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("SqlServer insert user.");
	}

	@Override
	public User getUser(int id) {
		System.out.println("SqlServer query user.");
		
		return null;
	}
}
