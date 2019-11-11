package practiceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;

public class deb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"Arish Z Dhingra 12","Nimisha C Bhati 23","Debraj K J 21", "Any C Any 23"};
		
		Hashtable<String, ArrayList<String>> hash = new Hashtable<String, ArrayList<String>>();
		for(int i=0; i<a.length;i++) {
			String temp[] = a[i].split(" ");
			if(!hash.containsKey(temp[1])) {
				ArrayList<String> templist = new ArrayList<String>();
				templist.add(a[i]);
				hash.put(temp[1], templist);
			}
			else {
				ArrayList<String> templist = new ArrayList<String>();
				templist = hash.get(temp[1]);
				templist.add(a[i]);
				hash.put(temp[1], templist);
			}
		}
		
		Set<String> set = hash.keySet();
		ArrayList<String> list = new ArrayList<String>();
		for(String c : set) {
			list.add(c);
		}
		Collections.sort(list);
		
		for(int i=0 ;i<list.size() ;i++) {
			System.out.println(hash.get(list.get(i)));
		}
	}

}
