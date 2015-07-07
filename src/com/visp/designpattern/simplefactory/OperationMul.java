package com.visp.designpattern.simplefactory;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return numberA * numberB;
	}
}
