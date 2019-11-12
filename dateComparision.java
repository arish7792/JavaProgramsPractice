package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateComparision {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat s = new SimpleDateFormat("mm-yyyy-dd");
		Date d1 = s.parse("03-2018-31");
		Date d2 = s.parse("04-2018-31");		
		System.out.println(d2.compareTo(d1));

	}

}
