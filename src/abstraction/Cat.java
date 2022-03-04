package abstraction;

public class Cat extends Animal{

	public Cat(String name, String type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meow meow");
	}
	
}
