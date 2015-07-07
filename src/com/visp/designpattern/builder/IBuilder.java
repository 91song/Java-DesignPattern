package com.visp.designpattern.builder;

public interface IBuilder {
	
	void buildAPart();

	void buildBPart();
	
	Product getResult();
}
