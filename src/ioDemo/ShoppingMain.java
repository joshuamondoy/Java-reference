package ioDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingMain {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Input\\ShoppingList.csv");
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String line;
		List<Grocery> shoppingList = new ArrayList<>();

		// read each line
		while ((line = reader.readLine()) != null) {
			// separate name and price
			String[] groceries = line.split(",");
			String name = groceries[0];
			// convert data type of price to double
			double price = Double.parseDouble(groceries[1]);
			// add to list as a Grocery object
			shoppingList.add(new Grocery(name, price));
		}
		reader.close();

		// sort in ASC order
		System.out.println("Ascending by name");
		shoppingList.sort((g1, g2) -> {
			return g1.getName().compareTo(g2.getName());
		});
		// display the contents using forEach
		System.out.println("Shopping list: ");
		shoppingList.forEach(grocery -> {
			System.out.println(grocery.getName() + " = " + grocery.getPrice());
		});

		// all items with price 100 and above
		List<Grocery> filteredList = new ArrayList<>();
		filteredList = shoppingList.stream().filter(g -> (g.getPrice() >= 100)).collect(Collectors.toList());
		// display the contents using forEach
		System.out.println("\nItems 100 and above: ");
		filteredList.forEach(grocery -> {
			System.out.println(grocery.getName() + " = " + grocery.getPrice());
		});

		// all items with price 100 below
		filteredList = shoppingList.stream().filter(g -> (g.getPrice() < 100)).collect(Collectors.toList());
		// display the contents using forEach
		System.out.println("\nItems 100 below: ");
		filteredList.forEach(grocery -> {
			System.out.println(grocery.getName() + " = " + grocery.getPrice());
		});

		// all items starting with 'C'
		filteredList = shoppingList.stream().filter(g -> (g.getName().charAt(0) == 'C')).collect(Collectors.toList());
		// display the contents using forEach
		System.out.println("\nItems starting with C: ");
		filteredList.forEach(grocery -> {
			System.out.println(grocery.getName() + " = " + grocery.getPrice());
		});

	}

}
