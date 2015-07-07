package com.visp.designpattern.factorymethod;

public class FactoryAdd implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}
}
