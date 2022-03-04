package ioAndException;
public class EmployeeValidation extends Employee {

	public EmployeeValidation(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}
	//accept the employee class and object as parameter
	public void validateInput(Employee emp) throws InvalidUserDetailException {

		// check if length of name is less than 3
		if (emp.getName().length() < 3)
			throw new InvalidUserDetailException("Name must not be less than 3 characters");

		// check if age is not valid (less than 18 or greater than 65
		boolean isNotValidAge = (emp.getAge() < 18) || (emp.getAge() > 65);
		if (isNotValidAge)
			throw new InvalidUserDetailException("Age must be between 18 and 65");

		// check if "female" or "male"
		boolean isValidGender = (emp.getGender().equalsIgnoreCase("female"))
				|| (emp.getGender().equalsIgnoreCase("male"));
		if (!isValidGender)
			throw new InvalidUserDetailException("Gender must either be female or male.");

		// all valid
		System.out.println("*** Employee Details ***");
		System.out.println(emp.toString());
	}

}


