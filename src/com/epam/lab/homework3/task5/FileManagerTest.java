package com.epam.lab.homework3.task5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class FileManagerTest {
	
	private final String filename = "test";

	@Test
	public void testCreatingFile() throws IOException {
		FileManager.createFile(filename);
		Path pathToNewFile = Paths.get(filename);
		Assert.assertTrue(pathToNewFile.toFile().exists());
	}
	
	@After
	public void cleanUpFile(){
		Path path = Paths.get(filename);
		path.toFile().delete();
	}

}
