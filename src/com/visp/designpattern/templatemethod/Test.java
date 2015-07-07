package com.visp.designpattern.templatemethod;

public class Test {
	
	// 模版方法模式：定义一个操作中算法的骨架，而将一些步骤延迟到子类中。
	// 模版方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
	public static void main(String[] args) {
		ITemplate template = new TemplateA();
		template.make();
	}
}
