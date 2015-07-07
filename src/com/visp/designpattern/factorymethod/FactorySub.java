package com.visp.designpattern.factorymethod;

public class FactorySub implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}
}
