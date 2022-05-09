package com.blz.workshop;

public abstract class Bird extends Pet {
	String species;

	@Override
	public String toString() {
		return "Bird [ id=" + id + ", name=" + name + ", colour=" + colour + ", age=" + age
				+ ", price=" + price + ", species=" + species +  "]";
	}
}