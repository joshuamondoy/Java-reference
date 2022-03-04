package innerClass;

public class ParentClass {
	private String name;
	private int age;
	public ParentClass() {
		this.name = "Joshua";
		this.age = 26;
		System.out.println("Parent Class created");
	}
	
	public void getDetails() {
		String name = "Grace";
		int age = 24;
		System.out.println("Hello, " + this.name + " you're " + this.age + " old.");
		
	}
	
	
	//The inner class
	public class InnerClass {
		public String name = "Grace";
		public int age = 24;
		
		
		
		public InnerClass() {
			System.out.println("\nInner Class created");
		}


		public void getDetails() {
			String name = "Grace";
			int age = 24;
			System.out.println("Hello, " + this.name + " you're " + this.age + " old.");
			
		}
	}
	
	

}

