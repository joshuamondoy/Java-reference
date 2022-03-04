package lists;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class JavaMapList {

	public static void main(String[] args) {
		// Map - stores key value pairs
				// each key should be unique

				// HashMap - doesn't retain insertion order
				// LinkedHashMap - retains insertion order
				// TreeMap - sort in ascending order

				// HashMap
				HashMap<Integer, String> myMap = new HashMap();
				// add contents
				myMap.put(1001, "Anna Smith");
				myMap.put(1002, "Will Smith");
				myMap.put(1234, "John Snow");
				myMap.put(2312, "Arya Stark");
				// display
				System.out.println("HashMap");
				System.out.println(myMap);

				// remove Will Smith
				myMap.remove(1002);
				System.out.println("Will Smith removed:");
				System.out.println(myMap);

				// Linked Hash Map
				System.out.println("\nLinked Hash Map:");
				LinkedHashMap<Integer, String> myLinkedMap = new LinkedHashMap<>();
				myLinkedMap.put(1001, "Anna Smith");
				myLinkedMap.put(1002, "Will Smith");
				myLinkedMap.put(1234, "John Snow");
				myLinkedMap.put(2312, "Arya Stark");

				// display
				System.out.println(myLinkedMap);

				// remove Will Smith
				myLinkedMap.remove(1002);
				System.out.println("Will Smith removed:");
				System.out.println(myLinkedMap);

				// TreeMap
				TreeMap<String, String> myTreeMap = new TreeMap<>();
				System.out.println("\nTreemap");
				myTreeMap.put("1001", "Anna Smith");
				myTreeMap.put("1002", "Will Smith");
				myTreeMap.put("2312", "Arya Stark");
				myTreeMap.put("1234", "John Snow");

				// display
				System.out.println(myTreeMap);

				// remove Will Smith
				myTreeMap.remove("1002");
				System.out.println("Will Smith removed:");
				System.out.println(myTreeMap);
			}

		}
