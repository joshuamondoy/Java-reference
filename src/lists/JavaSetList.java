package lists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetList {

	public static void main(String[] args) {
	// Sets can only contain unique values
			// HashSet - doesn't retain insertion order
			// LinkedHashSet - retains insertion order
			// TreeSet - sorts in ascending order

			// HashSet
			Set<String> mySet = new HashSet<>();
			// add contents
			mySet.add("Ann");
			mySet.add("Dennis");
			mySet.add("Michael");
			mySet.add("Bec");
			mySet.add("Ann");
			// display contents
			System.out.println(mySet);
			// remove Ann
			mySet.remove("Ann");
			System.out.println(mySet);

			// LinkedHashSet
			System.out.println("\nLinked Hash Set");
			Set<String> myLinkedhashSet = new LinkedHashSet<>();
			// add contents
			myLinkedhashSet.add("Ann");
			myLinkedhashSet.add("Dennis");
			myLinkedhashSet.add("Michael");
			myLinkedhashSet.add("Bec");
			myLinkedhashSet.add("Ann");
			// display contents
			System.out.println(myLinkedhashSet);

			myLinkedhashSet.remove("Bec");
			System.out.println(myLinkedhashSet);

			// TreeSet
			TreeSet<String> myTreeSet = new TreeSet<>();
			myTreeSet.add("Ann");
			myTreeSet.add("Dennis");
			myTreeSet.add("Michael");
			myTreeSet.add("Bec");
			myTreeSet.add("Ann");
			// display contents
			System.out.println(myTreeSet);

			myTreeSet.remove("Bec");
			System.out.println(myTreeSet);
		

	}
}


