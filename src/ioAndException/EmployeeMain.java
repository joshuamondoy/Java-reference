package ioAndException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Input\\Employee.csv");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;

		// read contents of file
		while ((line = reader.readLine()) != null) {
			try {

				String[] contents = line.split(",");
				// store to name
				String name = contents[0];
				// convert age to integer
				int age = Integer.parseInt(contents[1]);
				// store to gender
				String gender = contents[2];
				// create an Employee object and insert the value from the file being read
				Employee emp = new Employee(name, age, gender);
				// create EmployeeValidation object so that we can access it's methods for validation
				EmployeeValidation empValidation = new EmployeeValidation(name, age, gender);

				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Gender: " + gender);

				// validate the employee object data from the csv file
				empValidation.validateInput(emp);

			} catch (InvalidUserDetailException e) { //call the InvalidUserDetailException class as catch 
				System.out.println(e.getMessage());
			}

			System.out.println();

		}
		reader.close();
	}

}
