package practiceTest;

import java.io.*;
import java.util.Scanner;

public class fileReaderAndCountWord {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/adhingra/Desktop/testing.txt");
		
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
		
		System.out.println(sc.next());
		
	}

}
