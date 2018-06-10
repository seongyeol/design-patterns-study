package com.psy.designpatterns.duck;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		RedheadDuck redheadDuck = new RedheadDuck();
		RubberDuck rubberDuck = new RubberDuck();
		
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.fly();
		
		System.out.println();
		redheadDuck.display();
		
		System.out.println();
		rubberDuck.display();
		rubberDuck.fly();

	}

}
