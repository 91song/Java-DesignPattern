package com.visp.designpattern.factorymethod;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		return numberA / numberB;
	}
}
