package com.blz.workshop;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	
	private static UserInterface instance;
	private UserInterface() {
		
	}
	public static UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}
	
	public void print(Set<Pet> petList) {
		for(Pet pet: petList) {
			 System.out.println(pet);
		}		
	}
	
	public void printAnimals(Set<Pet> petList) {
		for(Pet pet: petList) {
			if(pet instanceof Animal) {
				System.out.println("Animals are: "+pet);
			}
		}
	}
	
	public void printBirds(Set<Pet> petList) {
		for(Pet o: petList) {
			if(o instanceof Bird) {
				System.out.println("Birds are:" +o);
			}
		}
	}
	
	public void printSwimmable(Set<Pet> petList) {
		for(Pet pet: petList) {
			if(pet instanceof Swimmable) {
				Swimmable swimmablePets = (Swimmable)pet;
				swimmablePets.swim();
			}
		}
	}
	
	public void printFlyable(Set<Pet> petList) {
		for(Pet pet: petList) {
			if(pet instanceof Flyable) {
				Flyable flyablePets = (Flyable)pet;
				flyablePets.fly();
			}
		}
	}
	public int showMainMenu() {
		System.out.println("Select \n1.Add Pet \n2.Print Pet \n3.Remove Pet \n4.Update Pet \n5.Exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		//scanner.close();
		return choice;
		
	}
	public int showUpdateMenu() {
		System.out.println("Select \n1.Update Pet name \n2.Update Age \n3.Update Prize \n4.Update Color \n5.Exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		//scanner.close();
		return choice;
	}
	public int showColor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Color:");
		System.out.println("1.BLACK, \n2.RED, \n3.WHITE, \n4.BLUE, \n5.BLACK_WHITE, \n6.GREEN, \n7.GREY");
		int choice = scanner.nextInt();
		//scanner.close();
		return choice;
	}
}
