package practiceTest;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class Graph {
	
	public static void addVertex(Hashtable<Integer,ArrayList<Integer>> hash, int a, int b) {
		
		if(!hash.containsKey(a)) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(b);
			hash.put(a, temp);
		}
		else {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp = hash.get(a);
			temp.add(b);
			hash.put(a, temp);
		}	
	}
	
	public static void findpath(int a, int b, Hashtable<Integer,ArrayList<Integer>> hash) {
		int flag = 0;
		ArrayList<Integer> path = new ArrayList<Integer>();
		path.add(a);
		
		if(!hash.containsKey(a)) {
			
		}
		else {
		while(hash.get(a).size()!=0) {
			if(hash.get(a).contains(b)) {
				 flag = 1;
				 break;
			}
			else {
				int temp = a;
				a = hash.get(a).get(0);			
				path.add(hash.get(temp).remove(0));				
			}		
		}
		}
		path.add(b);
		
		if(flag==1) {
			System.out.println("path found");
			System.out.println(path);
			
		}
		else {
			System.out.println("No");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,ArrayList<Integer>> hash = new Hashtable<Integer,ArrayList<Integer>>();
		addVertex(hash,1,2);
		addVertex(hash,2,3);
		addVertex(hash,3,4);
		
		Set<Integer> set = hash.keySet();
		
		findpath(1,4,hash);
		
//		for(int a : set) {
//			System.out.println(a+" -> "+hash.get(a));
//		}
	}

}
