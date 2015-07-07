package com.visp.designpattern.factorymethod;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return numberA * numberB;
	}
}
