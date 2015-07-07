package com.visp.designpattern.singleton;

public class SingletonC {
	private static SingletonC instance = null;

	private SingletonC() {

	}

	// 性能有所提升，在Java指令中创建对象和赋值操作是分开进行的
	// 也就是说instance = new Singleton();语句是分两步执行的。
	// 但是JVM并不保证这两个操作的先后顺序
	// 也就是说有可能JVM会为新的Singleton实例分配空间
	// 然后直接赋值给instance成员，然后再去初始化这个Singleton实例
	public static SingletonC getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SingletonC();
				}
			}
		}
		
		return instance;
	}

	public Object readResolve() {
		return getInstance();
	}
}
