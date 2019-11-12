package practice;

import java.util.Hashtable;

import java.util.List;

public class testq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"mission statement", "a quick bite to eat", "a chip off the old block", "chocolate bar", "mission impossible", "a man on a mission", "block party", "eat my words", "bar of soap"};
		//Hashtable<String, List<String>> hash = new Hashtable<String, List<String>>();
		
		for (int i=0 ;i<a.length-1; i++) {
			String temp[] = a[i].split(" ");
			for(int j=0; j<a.length;j++) {
				String temp1[] = a[j].split(" ");
				if(temp[temp.length-1].equals(temp1[0])) {
					String ans = a[i].concat(a[j]);
					String x = temp[temp.length-1]+temp[temp.length-1];
					String answer = ans.replaceAll(x, temp[temp.length-1]);
					System.out.println(answer);
				}
			}
		}
	}
}
