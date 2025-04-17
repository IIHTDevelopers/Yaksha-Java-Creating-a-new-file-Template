package com.yaksha.assignment;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		// **Create a new file**
		File file = new File("newFile.txt");

		try {
			// **Check if the file already exists, if not create a new file**
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while creating the file.");
			e.printStackTrace();
		}
	}
}
