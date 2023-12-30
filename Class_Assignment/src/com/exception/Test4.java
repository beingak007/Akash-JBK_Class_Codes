package com.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Test4 {

	    public static void main(String[] args) {
	        try {
	            File file = new File("nonexistent.txt"); // Try to access a file that does not exist
	            FileReader reader = new FileReader(file); // This line will throw a FileNotFoundException
	            reader.close(); // This line will not be reached
	        } catch (IOException e) {
	            System.out.println("An IOException occurred: " + e.getMessage());
	        }
	    }
	}


