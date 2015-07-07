package com.visp.designpattern.builder;

public class BuilderB implements IBuilder {
	Product product = new Product();
	
	@Override
	public void buildAPart() {
		product.add("a");
	}

	@Override
	public void buildBPart() {
		product.add("b");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
