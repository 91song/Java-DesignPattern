package com.visp.designpattern.state;

public class StateA extends State {

	@Override
	public void handle(Context context) {
		context.setState(new StateB());
	}
}
