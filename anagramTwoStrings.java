package practiceTest;

import java.util.Hashtable;
import java.util.Set;

public class anagramTwoStrings {
	
	public static void anagram(String a, String b) {
		Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();
		
		for(int i=0; i<a.length(); i++) {
			if(!hashtable.containsKey(a.charAt(i))) {
				hashtable.put(a.charAt(i),1);
			}else{
				hashtable.put(a.charAt(i), hashtable.get(a.charAt(i))+1);
			}
		}
		
		for(int i=0 ;i<b.length();i++) {
			if(hashtable.containsKey(b.charAt(i))) {
				hashtable.put(b.charAt(i),hashtable.get(b.charAt(i))-1);
			}
		}
		
		int flag =0;
		Set<Character> set = hashtable.keySet();
		for(Character c : set) {
			if(hashtable.get(c)!=0) {
				System.out.println("Both strings are not Anagram.");
				flag=1;
				break;
			}			
		}
		
		if(flag==0) {
			System.out.println("Both Strings are Anagram.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		anagram("AAAAA","AAA");

	}

}
