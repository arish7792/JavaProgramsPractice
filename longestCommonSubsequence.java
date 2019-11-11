package practiceTest;

import java.util.LinkedList;

public class longestCommonSubsequence {
	
	public static int lcm(char a[],char b[],int a1, int b1){
        if(a1>=a.length || b1>=b.length){
            return 0;
        }
        else if(a[a1]==b[b1]){
            return 1+lcm(a,b,a1+1,b1+1);
        }
        else{
            return Math.max(lcm(a,b,a1+1,b1),lcm(a,b,a1,b1+1));
        }
    }
	
	 public static int longestCommonSubsequence1(String text1, String text2) {
	        char a[] = text1.toCharArray();
	        char b[] = text2.toCharArray();
	        int a1=0;
	        int b1=0;
	        return lcm(a,b,a1,b1);
	        
	 }
	 
	 
	 
	 
	 public static int longestCommonSubstring(char a[], char b[], int a1, int b1, int curr) {
		 
		 if(a1>=a.length || b1>=b.length) {
			 return curr;
		 }
		 	
		 int curr1 = curr; 
		 if(a[a1] == b[b1]) {
			 curr1 = longestCommonSubstring(a,b,a1+1,b1+1,curr+1);
		 }
		
		 int curr2 = longestCommonSubstring(a,b,a1+1,b1,0);
		 int curr3 = longestCommonSubstring(a,b,a1,b1+1,0);
		 
		 return Math.max(curr1, Math.max(curr2, curr3));
		 
	 }

	 
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String a = "abcde";
//		String b = "abce";
//		
//		char a1[] = a.toCharArray();
//		char b1[] = b.toCharArray();
//		//System.out.println(longestCommonSubsequence1(a,b));
//		
//		System.out.println(longestCommonSubstring(a1,b1,0,0,0));
		
		int aa[][] = {{1,2},{2,3}};
		int temp[] = aa[1];
		System.out.println(temp[1]);
		
	}

}
