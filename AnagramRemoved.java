package practiceTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AnagramRemoved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s = new ArrayList<String>();	
		String a[] = {"code", "aaagmnrs","anagrams", "doce"};
		//System.out.println(a[0].substring(2,4));
		
		
		// Actual code starts here.
		ArrayList<String> temp = new ArrayList<String>();
		Set<String> result = new HashSet<String>();
		ArrayList<String> result1 = new ArrayList<String>();
		
		for(int i=0 ;i<s.size(); i++) {
			String temp1 = s.get(i);
			char temp1Array[] = temp1.toCharArray();
			Arrays.sort(temp1Array);
			String newTemp1 = "";
			for(int j=0; j<temp1Array.length; j++) {
				newTemp1 = newTemp1+ temp1Array[j];
			}
				for(int x=0; x<s.size(); x++) {
					if(!temp.contains(temp1) && !s.get(x).equals(temp1)){
						String temp2 = s.get(x);
						char temp2Array[] = temp2.toCharArray();
						Arrays.sort(temp2Array);
						String newTemp2 = "";
						for(int y=0; y<temp2Array.length; y++) {
							newTemp2 = newTemp2+ temp2Array[y];
						}
						
						if(newTemp1.equals(newTemp2)) {
							temp.add(temp2);
							result.add(temp1);
						}
						else {
							result.add(temp1);
						}
						
					}			
				}
		}
		for(String x : result) {
			result1.add(x);
		}
		Collections.sort(result1);
		System.out.println(result1);
	}
}
