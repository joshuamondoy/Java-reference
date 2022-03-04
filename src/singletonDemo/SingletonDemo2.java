package singletonDemo;

public class SingletonDemo2 {
	public void myMethod() {
		Student newStudent = Student.getInstance();
		System.out.println("Inside SingletonDemo2:");
		System.out.println(newStudent.toString());
		newStudent.setId(1002);
		newStudent.setName("Glen");
	}

}
