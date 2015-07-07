package com.visp.designpattern.facade;

public class Facade {
	SubSystemOne subSystemOne;
	SubSystemTwo subSystemTwo;
	SubSystemThree subSystemThree;
	SubSystemFour subSystemFour;
	
	public Facade() {
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	}
	
	public void methodA() {
		System.out.println("Method A");
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
		subSystemFour.methodFour();
	}
	
	public void methodB() {
		System.out.println("Method B");
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
	}
}
