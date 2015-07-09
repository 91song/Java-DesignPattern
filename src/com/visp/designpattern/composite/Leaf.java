package com.visp.designpattern.composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("Can not add component.");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Can not remove component.");
	}

	@Override
	public void display(int depth) {
		String line = "-";
		
		for (int i = 0; i < depth; i++) {
			line += "-";
		}
		
		System.out.println(line + name);
	}
}
