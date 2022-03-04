package comparatorAndComparable;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private String department;
	
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	// sort by id
	@Override
	public int compareTo(Employee o) {
		if (this.id > o.getId())
			return 1;

		if (this.id < o.getId())
			return -1;

		return 0;
	}

	
	
	

	


	
	

	
}
