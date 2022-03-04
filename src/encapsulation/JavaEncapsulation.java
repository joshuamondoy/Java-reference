package encapsulation;

public class JavaEncapsulation {

	public static void main(String[] args) {
		// encapsulation means hiding object fields to other class for security.
		// it uses access control to hide the fields
		
		Person person1 = new Person("Joshua", 27, "San Rafael, Rodriguez, Rizal");
		
		/* 
		 * this wont work since the field name is in private
		 * to access or set the attribute we need to use a method from that entity class getters/setters
		 * person1.name = "Joshua"; 
		 */
		System.out.println(person1.getName());

	}

}
