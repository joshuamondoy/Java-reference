package singletonDemo;


public class Student {
	//create instance of this class
	private static Student instance = new Student();

	public static Student getInstance() {
		return instance;
	}

	public static void setInstance(Student instance) {
		Student.instance = instance;
	}

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student() {
		// no args
		// empty
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}