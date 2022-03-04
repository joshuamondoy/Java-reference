package inheritance;

import java.util.Scanner;

public class JavaInheritance {
	public static void main(String[] args) {
		/*
		 * Inheritance in Java is a mechanism in which one object acquires 
		 * all the properties and behaviors of a parent object. 
		 * It is an important part of OOPs (Object Oriented programming system). 
		 */ 
		Human human1 = new Human("Homo sapiens", "80 - 100 years", "Filipino", "brown");
		
		/*
		 we are able to use the methods of the class LibingThings even we only 
		 instantiate the class Human since it already inherit the properties of LivingThings class
		*/
		System.out.println("Enter Skin color: ");
		Scanner s = new Scanner(System.in);
		String skinColor =  s.next();
		human1.setskinColor(skinColor);
		System.out.println("Species: " + human1.getSpecies());
		System.out.println("Skin color: " + human1.getskinColor());
		
		System.out.println(skinColor);
		
		// overrided method
		System.out.println(human1.showDetails());
	}

}

