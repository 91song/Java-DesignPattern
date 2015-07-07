package com.visp.designpattern.factorymethod;

public class FactoryMul implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}
}
