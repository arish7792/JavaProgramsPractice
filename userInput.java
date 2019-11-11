package practiceTest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Arish! Dhingra?";
		
		StringTokenizer st1 = new StringTokenizer(a,"!");
		
		
		
        while(st1.hasMoreElements()) {
        	System.out.println(st1.nextElement());
        }

	}

}
