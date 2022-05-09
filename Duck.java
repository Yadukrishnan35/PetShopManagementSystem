package com.blz.workshop;

public class Duck extends Bird implements Swimmable, Flyable {
	public Duck(String id ) {
		this.id = id;
		name = "Duck";
		colour = Colour.RED;	
	}
	
	@Override
	public void eat() {
		System.out.println("Ducks eat small fish");
	}
	
	@Override
	public void swim() {
		System.out.println("Duck can swim");
	}
	
	@Override
	public void fly() {
		System.out.println("Ducks can fly");
	}	
}