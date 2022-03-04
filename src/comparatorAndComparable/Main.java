package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1301, "Andrea Cruz", "HR"));
		employee.add(new Employee(1302, "Juan Bautista", "IT"));
		employee.add(new Employee(1300, "Mary Landaya", "HR"));
		employee.add(new Employee(1402, "Nina Reyes", "IT"));
		employee.add(new Employee(1123, "Liza Bayani", "CSR"));
		
		
		
		
		System.out.println("Sort by ID");
		Collections.sort(employee);
		for (Employee s : employee) {
			System.out.println("ID: " + s.getId() + " , Name: " + s.getName() + " , Department: " + s.getDepartment());
		}
		
		System.out.println();
		
		System.out.println("Sort by Name");
		Collections.sort(employee, new ComparatorClass("Name"));
		for (Employee s : employee) {
			System.out.println("ID: " + s.getId() + " , Name: " + s.getName() + " , Department: " + s.getDepartment());
				
		}
		
		System.out.println();
		
		System.out.println("Sort by Department");
		Collections.sort(employee, new ComparatorClass("Department"));
		for (Employee s : employee) {
			System.out.println("ID: " + s.getId() + " , Name: " + s.getName() + " , Department: " + s.getDepartment());
				
		}
		
	}
}
