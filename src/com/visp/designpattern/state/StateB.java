package com.visp.designpattern.state;

public class StateB extends State {

	@Override
	public void handle(Context context) {
		context.setState(new StateA());
	}
}
