package com.ktl.java.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWriteRunner {
	
	public static void main(String[] args) throws IOException {
		var path = Paths.get("./resources/sample.txt");
		var fileContents = Files.readString(path);
		System.out.println(fileContents);
		var newFileContents = fileContents.replace("Kaung Thu Lin", "Joker");
		var newPath = Paths.get("./resources/new-sample.txt");
		Files.writeString(newPath, newFileContents);
	}

}
