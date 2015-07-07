package com.visp.designpattern.simplefactory;

public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return numberA + numberB;
	}
}
