package com.visp.designpattern.simplefactory;

public class Test {

	// 
	public static void main(String[] args) {
		Operation operation = OperationFactory.createOperation("+");
		
		if (operation != null) {
			operation.numberA = 1;
			operation.numberB = 2;
			System.out.println(operation.getResult());
		}
	}
}
