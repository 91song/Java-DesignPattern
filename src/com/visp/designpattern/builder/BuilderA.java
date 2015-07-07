package com.visp.designpattern.builder;

public class BuilderA implements IBuilder {
	Product product = new Product();

	@Override
	public void buildAPart() {
		product.add("A");
	}

	@Override
	public void buildBPart() {
		product.add("B");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
