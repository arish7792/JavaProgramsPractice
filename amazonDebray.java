package practiceTest;

import java.util.Stack;

public class amazonDebray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String q = "ceaee";
		char a[][] = {{'a','b','c','e'},{'c','f','e','a'},{'c','a','e','d'}};
		
		String str = "";
		
		for(int i=0 ; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				str = str+a[i][j];
			}
		}		
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=str.length()-1; i>=0;i--) {
			stack.push(str.charAt(i));
		}
		

		int counter = 0;
		while(!stack.isEmpty()) {
			char x = stack.pop();
	
			if(counter<q.length()) {
				if(x==q.charAt(counter)) {
					counter++;	
			}	
			}
			
		}
		if(counter==q.length()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
