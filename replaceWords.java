package practice;

import java.util.ArrayList;

public class replaceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("bat");
		list.add("rat");
		
		String s = "the cattle was rattled by the battery";
		
		String array[] = s.split(" ");
		StringBuilder result = new StringBuilder();
		int k = 0;
		
		for(int i=0 ;i<array.length; i++) {
			for(String c: list) {
				if(array[i].contains(c)) {
					result.append(c+" ");
					k=1;
				}
			}
			if(k==0) {
				result.append(array[i]+" ");
			}
			else {
				k=0;
			}
		}
		
		System.out.println(result);
	}

}
