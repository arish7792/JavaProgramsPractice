package practiceTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csvReading {
	
	public static void printColumnElement(String path, int column) throws IOException {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(path));
			String x = br.readLine();
			int sum=0;
			while(x!=null) {
				String[] temp = x.split(",");
				sum = sum + Integer.parseInt(temp[column]);
				x = br.readLine();
			}
			
			System.out.println(sum/rows(path));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int columns(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String x = br.readLine();
		String a[] = x.split(",");
		return a.length;
	}
	
	public static int rows(String path) throws IOException {
		int count =0;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(path));
			String x = br.readLine();
			while(x!=null) {
				count++;
				x = br.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int rows = rows("/Users/adhingra/Desktop/test.csv");
		int columns = columns("/Users/adhingra/Desktop/test.csv");
		
		System.out.println("rows: "+rows+" and columns: "+columns);
		
		int index =0;		
		while(index<columns) {
			printColumnElement("/Users/adhingra/Desktop/test.csv",index);
			System.out.println("");
			index++;
		}
		
		
		//printColumnElement("/Users/adhingra/Desktop/test.csv",0);

	}

}
