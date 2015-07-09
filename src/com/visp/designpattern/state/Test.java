package com.visp.designpattern.state;

public class Test {

	// 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
	public static void main(String[] args) {
		Context context = new Context(new StateB());
		context.doSometing();
		context.doSometing();
		context.doSometing();
		context.doSometing();
		context.doSometing();
	}
}
