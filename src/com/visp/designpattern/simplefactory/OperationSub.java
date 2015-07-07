package com.visp.designpattern.simplefactory;

public class OperationSub extends Operation {

	@Override
	public double getResult() {
		return numberA - numberB;
	}
}
