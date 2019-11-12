package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("/Users/arishdhingra/Desktop/test.txt"));
		
	
		String a = "";
	
		while(in.hasNext()) {
		 a = a+in.next();
			
			
			
		}
		
		System.out.println("Number of characters in file are "+a.length());
		
	}

}
