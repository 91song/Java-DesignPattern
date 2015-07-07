package com.visp.designpattern.abstractfactory;

public interface IFactory {
	
	IUser createUser();
	
	IDepartment createDepartment();
}
