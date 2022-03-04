package ioDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class GroceryDemo {

	public static void main(String[] args) {
	//	Read and display the contents of Grocery.csv (C:\IODemo)
//		Display the no. of items and get the total amount.
		try {
			// reader
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Input\\Grocery2.csv"));

			// read the contents of file
			String line;
			List<String> groceries = new ArrayList<>();

			while ((line = reader.readLine()) != null) {
				// add the contents in the list
				groceries.add(line);
			}

			// close reader
			reader.close();

			// list of grocery
			List<Grocery> listItems = new ArrayList<>();
			
			// loop inside groceries ArrayList
			for (String s : groceries) {
				String[] splitContent = s.split(",");
				String name = splitContent[0];
				// convert to double
				double price = Double.parseDouble(splitContent[1]);

				// add the contents as Grocery object
				listItems.add(new Grocery(name, price));
			}

			// display the contents, no. of items, total amount
			double total = 0;
			for (Grocery g : listItems) {
				//display the name and price via toString
				System.out.println(g.toString());
				total = total + g.getPrice();
			}
			System.out.println("\nNo. of items: " + listItems.size());
			System.out.println("Total amount: " + total);

		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
		System.out.println("Thank you for shopping!");
		System.out.println("Goodbye!");
		}

	}

}
