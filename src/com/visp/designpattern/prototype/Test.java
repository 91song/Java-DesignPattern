package com.visp.designpattern.prototype;

public class Test {

	public static void main(String[] args) {
		Prototype prototype = new Prototype();
		prototype.setId(10);
		prototype.setName("abc");
		prototype.setObj(prototype.new MyObject());
		prototype.getObj().setName("def");
		
		try {
			Prototype prototype2 = (Prototype) prototype.clone();
			System.out.println(prototype2.getId());
			System.out.println(prototype2.getName());
			System.out.println(prototype2.getObj().getName());
			
			prototype2.setId(20);
			prototype2.setName("ABC");
			prototype2.getObj().setName("DEF");
			
			System.out.println(prototype.getName());
			System.out.println(prototype.getId());
			System.out.println(prototype.getObj().getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
