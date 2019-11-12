package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;

public class arrayofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,1,1},{2,2,2},{3,3,3}};

		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int x =0;
		int y =0;
		
		for(int i=0 ;i<a.length; i++) {
			for(int j=0 ; j<a[i].length; j++ ) {
				 x = x+ (a[i][j]*a[i][j]);
			}
			y = y+x;		
			table.put( Arrays.toString(a[i]), (int) Math.sqrt(y));		
			list.add((int) Math.sqrt(y));
			y = 0;
			x=0;
		}
		
		Set<String> set = table.keySet();		
		Collections.sort(list);
		
		for(String c: set) {
			if(table.get(c)==list.get(0)) {
				System.out.println(c);
			}
		}
	}

}
