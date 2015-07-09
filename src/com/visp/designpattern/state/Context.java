package com.visp.designpattern.state;

public class Context {
	private String value;
	private State state;
	
	public Context(State state) {
		this.state = state;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		
		System.out.println("Current state: " + state.getClass().getSimpleName());
	}
	
	public void doSometing() {
		state.handle(this);
	}
}
