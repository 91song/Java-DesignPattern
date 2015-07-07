package com.visp.designpattern.singleton;

public class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	// 非线程安全
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
}
