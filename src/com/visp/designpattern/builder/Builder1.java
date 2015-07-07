package com.visp.designpattern.builder;

public class Builder1 implements IBuilder {
	Product product = new Product();

	@Override
	public void buildAPart() {
		product.add("X");
	}

	@Override
	public void buildBPart() {
		product.add("Y");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
