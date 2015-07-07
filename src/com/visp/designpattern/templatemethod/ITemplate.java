package com.visp.designpattern.templatemethod;

public abstract class ITemplate {

	public abstract void start();
	
	public abstract void stop();

	public void make() {
		start();

		System.out.println("Making");

		stop();
	}
}
