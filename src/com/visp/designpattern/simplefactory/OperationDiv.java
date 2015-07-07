package com.visp.designpattern.simplefactory;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		return numberA / numberB;
	}
}
