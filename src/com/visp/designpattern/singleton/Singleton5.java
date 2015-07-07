package com.visp.designpattern.singleton;

public class Singleton5 {
	private static Singleton5 instance = null;

	private Singleton5() {

	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new Singleton5();
		}
	}

	public static Singleton5 getInstance() {
		if (instance == null) {
			syncInit();
		}
		
		return instance;
	}
}
