package com.visp.designpattern.factorymethod;

public class Test {

	// 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。
	// 工厂方法使一个类的实例化延迟到其子类。
	public static void main(String[] args) {
		IFactory factory = new FactoryMul();
		Operation operation = factory.createOperation();
		operation.numberA = 10;
		operation.numberB = 20;
		System.out.println(operation.getResult());
	}
}
