package practiceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;

public class KthMostRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aaaaaaaabbbbbffffssssssaaaaaqwwewewewewddddddd";
		Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
		
		for(int i=0 ; i<a.length(); i++) {
			if(!hash.containsKey(a.charAt(i))) {
				hash.put(a.charAt(i), 1);
			}
			else {
				hash.put(a.charAt(i), hash.get(a.charAt(i))+1);
			}
		}
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		Set<Character> set = hash.keySet();
		for(char s : set) {
			array.add(hash.get(s));
			System.out.println(s+" - "+hash.get(s));
		}
		
		Collections.sort(array);
		
		int mostRepeated = 3;
		
       int value = array.get(array.size()-mostRepeated);
       
       for(char s : set) {
    	   if(hash.get(s)==value) {
    		   System.out.println(mostRepeated+ " repeated element is "+s);
    	   }
       }
	}

}
