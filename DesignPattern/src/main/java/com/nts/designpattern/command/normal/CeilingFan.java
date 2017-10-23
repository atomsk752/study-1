package com.nts.designpattern.command.normal;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public void high(){
		speed = HIGH;
		System.out.println(location + " ceiling fan is on high");
	}

	public void medium(){
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low(){
		speed = LOW;
		System.out.println(location + " ceiling fan is on low");
	}

	public void on(){
		System.out.println(location + " CeilingFan is On");
	}

	public void off(){
		System.out.println(location + " CeilingFan is Off");
		speed = OFF;
	}

	public int getSpeed(){
		return speed;
	}
}
