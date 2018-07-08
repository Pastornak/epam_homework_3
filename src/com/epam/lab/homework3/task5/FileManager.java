package com.epam.lab.homework3.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

	public static void createFile(String filename) throws IOException{
		Path pathToFile = Paths.get(filename);
		Files.createFile(pathToFile);
	}
}
