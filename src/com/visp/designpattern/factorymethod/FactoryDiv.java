package com.visp.designpattern.factorymethod;

public class FactoryDiv implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}
}
