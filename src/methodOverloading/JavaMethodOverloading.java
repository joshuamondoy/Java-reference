package methodOverloading;

public class JavaMethodOverloading {
	
	public static void main(String[] args) {
	/* 
	 * in java we can create multiple methods with same name which is call method overloading
	 * they will only differ in different kinds or number of arguments and return type 
	 */
		getDetails();
		getDetails("Joshua");
		getDetails("Joshua", 27);
		
	}
	
	
	
	public static void getDetails() {
		System.out.println("Hi! my name is Joshua, 27 years old.");
	}
	public static void getDetails(String name) {
		System.out.println("Hi! my name is " + name + "," + " 27 years old.");
	}
	public static void getDetails(String name, int age) {
		System.out.println("Hi! my name is " + name + ", " + age + " years old.");
	}

}


