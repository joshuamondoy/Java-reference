package lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class JavaArrayList {
	public static void main(String[] args) {
		// ArrayList can only store object types and primitive types this is ideal for list of entity objects
		// ArrayList use add, get, remove and indexOf
		ArrayList<String> names = new ArrayList<>();

		// add values
		names.add("John");
		names.add("Barbie");
		names.add("Jelly");

		// display contents
		System.out.println(names.toString());

		// remove Barbie
		names.remove(1);

		System.out.println("Barbie removed: ");
		System.out.println(names.toString());
		System.out.println("At index 0: " + names.get(0));
		System.out.println("At index 1: " + names.get(1));

		// display using for loop
		System.out.println("Display contents using for loop");
		for (String s : names) {
			System.out.println(s);
		}

		// LinkedList
		System.out.println("\nLinked List:");
		LinkedList<String> myLinkedList = new LinkedList<>();

		// add contents
		myLinkedList.push("Stephen");
		myLinkedList.push("Aira");
		myLinkedList.push("DJ");

		// display the contents
		System.out.println(myLinkedList);

		System.out.println("Peek : " + myLinkedList.peek());
		System.out.println(myLinkedList);
		System.out.println("Pop : " + myLinkedList.pop());
		System.out.println(myLinkedList);

		// display using for loop
		System.out.println("\nDisplay contents using for loop");
		for (String s : myLinkedList) {
			System.out.println(s);
		}
	}

}
