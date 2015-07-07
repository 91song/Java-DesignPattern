package com.visp.designpattern.singleton;

public class Singleton2 {
	private static Singleton2 instance = null;
	
	private Singleton2() {
		
	}
	
	// synchronized关键字锁住的是这个对象，这样的用法在性能上会有所下降
	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
}
