package fileFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Input\\Files.txt"));
		String line;

		FileType fileType;
		FileFactory factory = new FileFactory();

		while ((line = reader.readLine()) != null) {
			fileType = factory.getFileType(line);
			System.out.println("Filename: " + line);
			fileType.displayFileType();
			System.out.println();
		}
		reader.close();

	}

}
