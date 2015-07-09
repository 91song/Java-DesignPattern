package com.visp.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> components = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		components.add(component);
	}

	@Override
	public void remove(Component component) {
		components.remove(component);
	}

	@Override
	public void display(int depth) {
		String line = "-";
		
		for (int i = 0; i < depth; i++) {
			line += "-";
		}
		
		System.out.println(line + name);
		
		for (Component component : components) {
			component.display(depth + 2);
		}
	}
}
