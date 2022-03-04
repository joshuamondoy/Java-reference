package ioDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IODemo {

	public static void main(String[] args) throws IOException {
		// Create a program that will read Test.txt in C:\IODemo.
		// Display the contents of the file then in another file , TestWrite.txt
		// write the contents of the file and append "YES!!!!" at end of each line.

		// set file
		File file = new File("C:\\Input\\Test.csv");

		// reader
		BufferedReader reader = new BufferedReader(new FileReader(file));

		// read contents of file
		String line;
		List<String> contents = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			// display contents of file
			contents.add(line);
			System.out.println(line);
		}
//		System.out.println(contents);
		
		// close reader
		reader.close();
		

		// write to file
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Input\\TestWrite.txt"));
		for (String s : contents) {
			 writer.write(s + " YES!!!\n");
		}
		
		
		// close the writer
		writer.close();
		
		
		
	}

}
