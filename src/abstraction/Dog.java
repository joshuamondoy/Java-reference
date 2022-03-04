package abstraction;

public class Dog extends Animal implements Movement, Eating{

	public Dog(String name, String type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Aww aww");
		
	}

	@Override
	public void action() { 
		// override from movement class
		System.out.println("Running");
		
	}

	@Override
	public void food() {
		System.out.println("Eats dog food");
		
	}

	
	
	
}
