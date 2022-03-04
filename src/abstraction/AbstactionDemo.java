package abstraction;

public class AbstactionDemo {

	public static void main(String[] args) {
		// Abstract class are class that cannot be instantiate
		// Abstract class needs to have a subclass which can be instantiated and inherit it's fields and methods
		// Abstract class can use abstract method or regular method which can also be inherited and instantiate by subclass
		// Interface class on the other hand is same as Abstract class the only difference is Interface does not use inheritance
		// Interface use implements to instantiate it's method
		// We can use more than 1 Interface to a subclass unlike Inheritance which is only 1
		
		// Animal anima1 = new Animal(); this wont work because Animal class is an abstact class
		
		Dog dog1 = new Dog("Bownie", "Mamal");
		dog1.sound();
		dog1.food();
		
		Cat cat1 = new Cat("Muning", "Mamal");
		cat1.sound();
		
		Fish fish1 = new Fish("Goldie", "Mamal");
		fish1.sound();
		
		fish1.setName("Nemo");
		
		
		
		System.out.println("The fish name is " + fish1.getName());
		cat1.setName("Mingming");
		System.out.println("The new name of cat is " + cat1.getName());

	}

	

}
