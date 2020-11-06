package com.revature.design.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String t) {
		if(t.equalsIgnoreCase("Green")) {
			return new Green();
		}else if (t.equalsIgnoreCase("Pink")) {
			return new Pink();
		}
		return null;
	}

}
