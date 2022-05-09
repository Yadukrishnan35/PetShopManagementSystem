package com.blz.workshop;

import java.util.Scanner;
import java.util.Set;
import com.blz.workshop.Pet.Colour;

public class Main {
	
	
	public void handleUserSelection(int choice) {
		
		PetStorage petStorage =  PetStorage.getInstance();
		UserInterface userInterface = UserInterface.getInstance();
		
		Scanner scanner = new Scanner(System.in);
		switch(choice) {
		case 1: 
				addPet();
				break;
		case 2: 
				userInterface.print(petStorage.getPetList());
				break;
		case 3:
				System.out.println("Enter the Pet id to remove:");
				String petId = scanner.next();
				Pet petforRemove = petStorage.getPet(petId);
				petStorage.remove(petforRemove);
				break;
		case 4: 
			    System.out.println("Enter the id to update:");
			    String petIdForUpdate = scanner.next();
			    Pet petForUpdate = petStorage.getPet(petIdForUpdate);
			    updatePet(petForUpdate);
			    break;
		default: 
				System.out.println("Choose Correct Option");
		}
		//scanner.close();	
	}
	public void addPet() {
		
		Animal dog = new Dog("D001");
		dog.age = 4;
		dog.breed = "German";
		dog.price = 1000;
		
		
		Animal dog1 = new Dog("D001");
		dog1.age = 4;
		dog1.breed = "German";
		dog1.price = 1000;
		
		Bird duck = new Duck("DK001");
		duck.age = 2;
		duck.species = "Indian";
		duck.price = 100;
		
		Bird parrot = new Parrot("P001");
		parrot.age = 3;
		parrot.species = "Galah";
		parrot.price = 150;
		
		Animal rabbit = new Rabbit("R001");
		rabbit.age = 7;
		rabbit.breed = "Angora";
		rabbit.price = 1000;
		
		Animal cat = new Cat("C001");
		cat.age = 4;
		cat.breed = "Bengal";
		cat.price = 80;
		
		PetStorage petStorage = PetStorage.getInstance();
		petStorage.add(cat);
		petStorage.add(dog);
		petStorage.add(dog1);
		petStorage.add(duck);
		petStorage.add(parrot);
		petStorage.add(rabbit);

	}
	
	public void setColor(Pet pet) {
		//int choice = userInterface.showColor();
		Scanner scanner = new Scanner(System.in);
		int count =0;
		for(Colour c: Colour.values()) {
			count++;
			System.out.println(count + " " +c);
			
		}
		int colorChoice = scanner.nextInt();	
		
		switch(colorChoice) {
			
			case 1 : 
					pet.colour = Colour.BLACK;
						break;
			case 2 : 
					pet.colour = Colour.RED;
						break;
			case 3 : 
					pet.colour = Colour.WHITE;
						break;
			case 4	: 
					pet.colour = Colour.BLUE;
						break;
			case 5 : 
					pet.colour = Colour.BLACK_WHITE;
						break;
			case 6 : 
					pet.colour = Colour.GREEN;
						break;
			case 7 : 
					pet.colour = Colour.GREY;
						break;
			default : System.out.println("Not valid");
		}
		//scanner.close();
	}	
	
	public void updatePet(Pet petForUpdate) {
		
		UserInterface userInterface = UserInterface.getInstance();
		
		int choice = userInterface.showUpdateMenu();
		Scanner scanner = new Scanner(System.in);
		switch(choice) {
			
		case 1	: 	
					System.out.println("Enter the new Pet name :");
					petForUpdate.name = scanner.next();
					break;
		case 2	:	
					System.out.println("Enter the new Age:");
					petForUpdate.age = scanner.nextInt();
					break;
		case 3	: 
					System.out.println("Enter the new Prize:");
					petForUpdate.price = scanner.nextInt();
					break;
		case 4 : 	
					setColor(petForUpdate);
					break;
		case 5	: 
		
		
		default : System.out.println("Invalid Option");			
		}
		
		//scanner.close();
	}
	
	public static void main(String[] args) {
		
		UserInterface userInterface = UserInterface.getInstance();
		Main main = new Main();
		int choice = 0;
		while(choice != 5) {
		choice = userInterface.showMainMenu();
		main.handleUserSelection(choice);
	}
		
		
		
		
		
		/*
		System.out.println("Welcome to pet management system");
		
				
		UserInterface userInterface = new UserInterface();
		//userInterface.print(petStorage.getPetList()); 
		Set petList = petStorage.getPetList();
		userInterface.print(petList);
		
		petStorage.remove(cat);	
		System.out.println("After removing");
		petList = petStorage.getPetList();
		userInterface.print(petList);
		
		System.out.println("Animals are");
		userInterface.printAnimals(petList);
		
		System.out.println("Birds are");
		userInterface.printBirds(petList);
		
		userInterface.printSwimmable(petList);	
		userInterface.printFlyable(petList);
	*/
	}

}
