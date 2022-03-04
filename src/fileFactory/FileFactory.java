package fileFactory;

public class FileFactory {

	public FileType getFileType(String filename) {
		if (filename.endsWith("txt"))
			return new TxtFile();
		if (filename.endsWith("csv"))
			return new CsvFile();
		if (filename.endsWith("png"))
			return new PngFile();
		return null;
	}

}
