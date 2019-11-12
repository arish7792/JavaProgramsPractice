package practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class filesAndFolders {
	
	 
	
	public static void samefiles(String path, Hashtable<String, ArrayList<String>> hash) {
		
		File file = new File(path);
		File[] folders = file.listFiles();
		for(File f : folders) {
				if(!hash.containsKey(path)) {
					hash.put(path,new ArrayList<String>());
					hash.get(path).add(f.getName());
				}
				else {
					hash.get(path).add(f.getName());
				}
				if(f.isDirectory()) {
					samefiles(f.getAbsolutePath(), hash);
				}
		
		
	}
		Set<String> set = hash.keySet();
		Set<String> Set = new HashSet<String>();
		for(String str : set) {
			Set.add(str);
		}
		System.out.println(Set);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, ArrayList<String>> hash = new Hashtable<String, ArrayList<String>>();
		String path = "/Users/arishdhingra/Desktop/Arish/FileTesting";
		samefiles(path,hash);

	}

}
