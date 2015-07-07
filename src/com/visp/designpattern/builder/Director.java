package com.visp.designpattern.builder;

public class Director {
	
	public void construct(IBuilder builder) {
		builder.buildAPart();
		builder.buildBPart();
	}
}
