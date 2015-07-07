package com.visp.designpattern.observer;

public class Test {
	
	// 观察者模式：定义了一种一对多的依赖关系，让多外观察者对象同时监听某一个主题对象。
	// 这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
	public static void main(String[] args) {
		Subject subject = new SubjectA();
		subject.attach(new ObserverA("A", subject));
		subject.setSubjectState("close");
		subject.notification();
	}
}
