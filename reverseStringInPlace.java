package practiceTest;

import java.util.Stack;

public class reverseStringInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Arish is a boy";
		Stack<Character> stack = new Stack<Character>();
		StringBuilder string = new StringBuilder();
		
		for(int i=0 ;i<a.length(); i++) {
			if(a.charAt(i)!=' ') {
				stack.push(a.charAt(i));
				}
			else {
				while(!stack.isEmpty()) {
					string.append(stack.pop());
				}
				string.append(' ');
			}
		}
		
		while(!stack.isEmpty()) {
			string.append(stack.pop());
		}
		
		System.out.println(string);

	}

}
