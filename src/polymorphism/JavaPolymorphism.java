package polymorphism;

public class JavaPolymorphism {
//	Polymorphism means "many forms", and it occurs when we have many classes 
//	that are related to each other by inheritance.

	public static void main(String[] args) {
		Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myPig = new Pig();  // Create a Pig object
	    Animal myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();

	}

}
