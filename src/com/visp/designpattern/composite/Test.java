package com.visp.designpattern.composite;

public class Test {
	
	// 组合模式：将对象组合成树形结构以表示部分-整体的层次结构。
	// 组合模式使得用户对单个对象和组合对象的使用具有一致性。
	public static void main(String[] args) {
		Composite root = new Composite("Root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite compositeA = new Composite("Composite A");
		compositeA.add(new Leaf("Leaf X"));
		Composite compositeB = new Composite("Composite B");
		compositeB.add(new Leaf("Leaf Y"));
		root.add(compositeA);
		root.add(compositeB);
		
		root.display(0);
	}
}
