package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ssnRegexPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "\\d{3}[-]?\\d{2}[-]?\\d{4}";
		String x = "818-61-80359";
		
		Pattern pattern = Pattern.compile(a);
		Matcher matcher = pattern.matcher(x);
		
		//System.out.println(matcher.matches());
		
		int d =0;
		
		if(matcher.matches()) {
			d =1; 
		}
		
		if(d==1) {
			System.out.println("Pattern Matches");
		}
		else {
			System.out.println("It does not match.");
		}

	}

}
