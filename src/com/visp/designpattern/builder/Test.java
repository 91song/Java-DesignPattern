package com.visp.designpattern.builder;

public class Test {
	
	// 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
	public static void main(String[] args) {
		Director director = new Director();
		IBuilder builder1 = new BuilderA();
		IBuilder builder2 = new BuilderB();
		director.construct(builder1);
		director.construct(builder2);
		builder1.getResult().show();
		builder2.getResult().show();
	}
}
