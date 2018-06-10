package com.psy.designpatterns.duck;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("display RubberDuck");
	}
	
	@Override
	public void fly() {
		System.out.println("can't fly");
	}
}
