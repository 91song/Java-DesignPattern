package com.visp.designpattern.singleton;

public class SingletonE {
	private static SingletonE instance = null;

	private SingletonE() {

	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonE();
		}
	}

	public static SingletonE getInstance() {
		if (instance == null) {
			syncInit();
		}
		
		return instance;
	}
}
