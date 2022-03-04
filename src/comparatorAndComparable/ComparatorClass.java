package comparatorAndComparable;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Employee> {
	private String toSort;
	
	public ComparatorClass(String toSort) {
		this.toSort = toSort;
	}

	
	//sort by name and department
	@Override
	public int compare(Employee o1, Employee o2) {
		
		if (this.toSort == "Name") {
			return o1.getName().compareTo(o2.getName());
		} else if (this.toSort == "Department") {
			return o1.getDepartment().compareTo(o2.getDepartment());
		}
		return 0;
	}

}
