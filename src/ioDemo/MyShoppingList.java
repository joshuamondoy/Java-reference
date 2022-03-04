package ioDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyShoppingList {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Input\\ShoppingList.csv"));
		
		//create a new list object from class Grocery
		List<Grocery> shoppingList = new ArrayList<>();
		
		String line;
		
		while((line = reader.readLine()) != null) {
			String[] splitContent = line.split(",");
			String name = splitContent[0];
			double price = Double.parseDouble(splitContent[1]);
			
			shoppingList.add(new Grocery(name, price));
			
		}
		reader.close();
		// sort in ASC order
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
