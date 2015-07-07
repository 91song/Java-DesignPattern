package com.visp.designpattern.abstractfactory;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("Access insert user.");
	}

	@Override
	public User getUser(int id) {
		System.out.println("Access query user.");
		
		return null;
	}
}
