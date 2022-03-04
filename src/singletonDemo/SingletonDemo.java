package singletonDemo;

public class SingletonDemo {
	public static void main(String[] args) {

		Student student = Student.getInstance();
		student.setId(1001);
		student.setName("Julius");

		// display the contents
		System.out.println(student.toString());

		System.out.println();
		SingletonDemo2 sd2 = new SingletonDemo2();
		sd2.myMethod();
		System.out.println("Back at main class:");
		System.out.println(student.toString());
	}

}
