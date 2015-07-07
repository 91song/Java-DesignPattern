package com.visp.designpattern.templatemethod;

public class TemplateB extends ITemplate {

	@Override
	public void start() {
		System.out.println("Start B");
	}

	@Override
	public void stop() {
		System.out.println("Stop B");
	}
}
