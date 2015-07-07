package com.visp.designpattern.templatemethod;

public class TemplateA extends ITemplate {

	@Override
	public void start() {
		System.out.println("A start");
	}

	@Override
	public void stop() {
		System.out.println("A stop");
	}
}
