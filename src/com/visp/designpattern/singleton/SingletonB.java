package com.visp.designpattern.singleton;

public class SingletonB {
	private static SingletonB instance = null;
	
	private SingletonB() {
		
	}
	
	// synchronized关键字锁住的是这个对象，这样的用法在性能上会有所下降
	public static synchronized SingletonB getInstance() {
		if (instance == null) {
			instance = new SingletonB();
		}
		return instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
}
