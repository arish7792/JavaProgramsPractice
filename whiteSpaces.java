package practice;

import java.util.Arrays;

public class whiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String a = "I am Shrey.";
//		String b = "";
//		for (int i=0 ; i<a.length(); i++) {
//			if(a.charAt(i)==' ') {
//				b = b+"";
//			}
//			else {
//				b = b+a.charAt(i);
//			}
//		}
		String x ="cda";
		char temp[] = x.toCharArray();
        Arrays.sort(temp);
        String temp1 = "";
        
        for(int i= 0; i<temp.length; i++) {
        	temp1= temp1+temp[i];
        }
       // String temp1 = temp.toString();
        System.out.println(temp1);
	}

}
