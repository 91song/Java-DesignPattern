package com.visp.designpattern.singleton;

public class SingletonA {
	private static SingletonA instance = null;
	
	private SingletonA() {
		
	}
	
	// 非线程安全
	public static SingletonA getInstance() {
		if (instance == null) {
			instance = new SingletonA();
		}
		return instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
}
