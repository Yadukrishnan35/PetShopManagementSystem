package com.blz.workshop;

public class Parrot extends Bird implements Flyable {
	public Parrot(String id) {
		this.id = id;
		name = "Parrot";
		colour = Colour.GREEN;	
	}
	
	@Override
	public void eat() {
		System.out.println("Parrots eat rice");
	}
	
	public void fly() {
		System.out.println("Parrots can fly");
	}
}