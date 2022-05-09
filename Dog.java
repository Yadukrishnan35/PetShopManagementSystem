package com.blz.workshop;

public class Dog extends Animal implements Swimmable {
	public Dog(String id) {
		this.id = id;
		name = "Dog";
		colour = Colour.GREY;
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eats non-veg items");
	}
	
	@Override
	public void swim() {
		System.out.println("Dogs can swim");
	}
}
